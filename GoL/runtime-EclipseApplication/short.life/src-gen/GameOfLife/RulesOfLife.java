package GameOfLife;

import java.awt.Point;
import java.util.ArrayList;

public class RulesOfLife {
    
    /* * GENERATED METHOD: computeSurvivors
     * Based on DSL rules defined in: ConwaysLife
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
                // Rule: Live if neighbors == 2
                if ((gameBoard[i][j]) && (surrounding == 2)) {
                    survivingCells.add(new Point(i-1, j-1));
                }
                // Rule: Live if neighbors == 3
                if ((gameBoard[i][j]) && (surrounding == 3)) {
                    survivingCells.add(new Point(i-1, j-1));
                }
                // Rule: ToAlive if neighbors == 3
                if ((!gameBoard[i][j]) && (surrounding == 3)) {
                    survivingCells.add(new Point(i-1, j-1));
                }
            }
        }
    }

    /* * GENERATED METHOD: initializeGrid
     * Defines the initial state based on the DSL Grid
     */
    public static void initializeGrid(ArrayList<Point> points) {
        points.clear();
        points.add(new Point(1, 2));
        points.add(new Point(2, 2));
        points.add(new Point(3, 2));
    }
}
