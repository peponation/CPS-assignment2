package gameoflife.validation

import org.eclipse.xtext.validation.Check
import gameoflife.gDSL.Rule
import gameoflife.gDSL.GDSLPackage
import gameoflife.gDSL.Grid
import gameoflife.gDSL.Rules
import java.util.HashSet

class GDSLValidator extends AbstractGDSLValidator {

    // --- RULE 1: Check for Valid Neighbor Counts ---
    // A cell in Game of Life only has 8 neighbors. Specifying > 8 is impossible.
    @Check
    def checkNeighborAmount(Rule rule) {
        if (rule.amount > 8) {
            error("A cell cannot have more than 8 neighbors.", 
                GDSLPackage.Literals.RULE__AMOUNT)
        }
    }

    // --- RULE 2: Check for Duplicate Cells ---
    // Defining (1,1) twice is redundant and might confuse the user.
    @Check
    def checkDuplicateCells(Grid grid) {
        val seenCoordinates = new HashSet<String>()
        
        for (i : 0 ..< grid.cell.size) {
            val cell = grid.cell.get(i)
            val key = cell.x + "," + cell.y
            
            if (seenCoordinates.contains(key)) {
                warning("Duplicate cell definition.", 
                    GDSLPackage.Literals.GRID__CELL, 
                    i // Report error on the specific list index
                )
            } else {
                seenCoordinates.add(key)
            }
        }
    }

    // --- RULE 3: Check for Conflicting Rules ---
    // Example: Defining both "Live if = 3" and "Die if = 3" creates ambiguity.
    @Check
    def checkRuleConflicts(Rules rules) {
        for (i : 0 ..< rules.rules.size) {
            val ruleA = rules.rules.get(i)
            
            for (j : i + 1 ..< rules.rules.size) {
                val ruleB = rules.rules.get(j)
                
                // If the operator and amount are the same (e.g., both are "= 3")
                if (ruleA.operator == ruleB.operator && ruleA.amount == ruleB.amount) {
                    // And the states are different (e.g., one is Live, one is Die)
                    if (ruleA.state != ruleB.state) {
                        error("Conflicting rule: cannot have different outcomes for the same condition.",
                            GDSLPackage.Literals.RULES__RULES,
                            j // Highlight the second rule
                        )
                    }
                }
            }
        }
    }
}