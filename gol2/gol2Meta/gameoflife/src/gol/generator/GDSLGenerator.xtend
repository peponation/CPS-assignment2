package gol.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import gol.gDSL.GOL
import gol.gDSL.State
import gol.gDSL.Compare
import gol.gDSL.Rule

class GDSLGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        // 1. Find the GOL (Game of Life) model in the file
        val root = resource.allContents.filter(GOL).head

        if (root !== null) {
            // 2. Generate the RulesOfLife.java file
            // We use the package "GameOfLife" to match your provided files
            fsa.generateFile("GameOfLife/RulesOfLife.java", '''
				package GameOfLife;
				
				import java.awt.Point;
				import java.util.ArrayList;
				
				public class RulesOfLife {
				    
				    /* * GENERATED METHOD: computeSurvivors
				     * Based on DSL rules defined in: «root.name»
				     */
				    public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {
				        // Iterate through the array (leaving a 1-pixel border to avoid IndexOutOfBounds)
				        for (int i=1; i<gameBoard.length-1; i++) {
				            for (int j=1; j<gameBoard[0].length-1; j++) {
				                int surrounding = 0;
				                
				                // Count neighbors
				                if (gameBoard[i-1][j-1]) { surrounding++; }
				                if (gameBoard[i-1][j])   { surrounding++; }
				                if (gameBoard[i-1][j+1]) { surrounding++; }
				                if (gameBoard[i][j-1])   { surrounding++; }
				                if (gameBoard[i][j+1])   { surrounding++; }
				                if (gameBoard[i+1][j-1]) { surrounding++; }
				                if (gameBoard[i+1][j])   { surrounding++; }
				                if (gameBoard[i+1][j+1]) { surrounding++; }
				
				                /* GENERATED RULES */
				                «FOR rule : root.rules.rules»
					«compileRule(rule)»
				                «ENDFOR»
				            }
				        }
				    }
				
				    /* * GENERATED METHOD: initializeGrid
				 * Defines the initial state based on the DSL Grid
				 */
				    public static void initializeGrid(ArrayList<Point> points) {
				        points.clear();
				        «FOR cell : root.grid.cell»
				        	points.add(new Point(«cell.x», «cell.y»));
				        «ENDFOR»
				    }
				}
			''')
        }
    }

    // Helper method to turn a DSL Rule into Java code
    def compileRule(Rule rule) {
        // We only generate code for cases where a cell results in being ALIVE.
        // "Die" or "Dead" results are handled by simply NOT adding the point to the list.
        
        // 1. Determine the Check: Is the cell currently Alive or Dead?
        var currentStatusCheck = ""
        
        if (rule.state == State.LIVE) {
            // Rule: "Live if..." -> Cell must currently be ALIVE (true)
            currentStatusCheck = "gameBoard[i][j]" 
        } else if (rule.state == State.TO_ALIVE) {
            // Rule: "BecomeAlive if..." -> Cell must currently be DEAD (false)
            currentStatusCheck = "!gameBoard[i][j]"
        } else {
            // If the rule is "Die" or "Dead", we generate nothing (return empty string)
            return "" 
        }

        // 2. Determine the Operator (<, >, =)
        var operatorSymbol = ""
        switch (rule.operator) {
            case Compare.LT: operatorSymbol = "<"
            case Compare.GT: operatorSymbol = ">"
            case Compare.EQ: operatorSymbol = "=="
        }

        // 3. Assemble the Java If-statement
        return '''
			// Rule: «rule.state» if neighbors «operatorSymbol» «rule.amount»
			if ((«currentStatusCheck») && (surrounding «operatorSymbol» «rule.amount»)) {
			    survivingCells.add(new Point(i-1, j-1));
			}
		'''
    }
}
