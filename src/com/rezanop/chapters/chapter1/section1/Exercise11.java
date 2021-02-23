package com.rezanop.chapters.chapter1.section1;

import com.rezanop.libs.StdOut;

public class Exercise11 {

    public static void main (String[] args) {
        boolean[][] testMatrix = {
                {true, true, true, false},
                {true, true, false, true},
                {true, false, true, false},
                {false, false, false, true}
        };

        printMatrix(testMatrix);
    }

    private static void printMatrix (boolean[][] matrix) {
        printColumnNumber(matrix.length);
        for ( int row = 0; row < matrix.length; row++) {
            printRowNumber(row);
            for (int col = 0; col < matrix[row].length; col++) {
                printCell(matrix[row][col]);
            }
            StdOut.println();
        }
    }

    private static void printColumnNumber(int totalColumns) {
        StdOut.print("_|");
        for (int colNumber = 1; colNumber <= totalColumns; colNumber++) {
            StdOut.print(colNumber + "|");
        }
        StdOut.println();
    }

    private static void printRowNumber(int rowNumber) {
        StdOut.print(rowNumber + 1 + "|");
    }

    private static void printCell(boolean value) {
        if (value) {
            StdOut.print("*|");
        } else {
            StdOut.print(" |");
        }
    }
}
