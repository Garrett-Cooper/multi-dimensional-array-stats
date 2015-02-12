/**
 * CIT 111 Intro to Programming 
 * Assignment 8 
 * 11/4/2014 
 * Author: Garrett Cooper
 * Matrix Mangler Program
 */

package multidimarrays_hw;

// Imports scanner class from java utilities
import java.util.Scanner;

public class MultiDimArrays_HW {

    public static void main(String[] args) {

        // Declares variable console to hold user input values
        Scanner console = new Scanner(System.in);

        // Prints out program header
        System.out.println("\nCIT111 Fall 2014, Assignment 8");
        System.out.println("Garrett Cooper");
        System.out.println("Matrix Mangler Version 0.42\n");

        // Declares and initialize a 3x3 array called 'matrix'
        double[][] matrix = new double[3][3];

        // Outputs the user to enter a 3x3 array of double values
        System.out.println("Please enter " + matrix.length + " rows of "
                + matrix[0].length + " double values: ");

        // An inner and outer 'for loop' prompts the user to enter 3 values for... 
        // each of the 3 rows, and stores the 3x3 array in the variable, 'matrix'
        for (int row = 0; row < matrix.length; row++) {
            System.out.print("Row " + (row + 1) + ":\t");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = console.nextDouble();
            }
        }

        System.out.println();

        // Calls the 'sumColumn' method and calculates the sum of a column
        // based on the array 'matrix' and a user-defined column of 0-2 index
        System.out.println("The sum of the elements at Column 1 is "
                + sumColumn(matrix, 0));

        System.out.println("The sum of the elements at Column 2 is "
                + sumColumn(matrix, 1));

        System.out.println("The sum of the elements at Column 3 is "
                + sumColumn(matrix, 2));

        System.out.println();

        // Calls the 'sumMajorDiagonal' method and sums the major diagonal
        // based on the 'matrix' array
        System.out.println("The sum of the elements along the major diagonal is "
                + sumMajorDiagonal(matrix));

        System.out.println();

        // Program termination statement
        System.out.println("Our work is done here. "
                + "The program will now terminate.");
        
        System.out.println();

    }

    // Creates a method that sums a particular column in an array,
    // provided an array ('matrix') and a column number ('columnIndex')  
    public static double sumColumn(double[][] matrix, int columnIndex) {
        
        double colSum = 0; // Intitializes total for column

        // 'For loop' sums all elements across a given set of rows for...
        // a specified column ('columnIndex')
        for (int row = 0; row < matrix.length; row++) {
            colSum += matrix[row][columnIndex];
        }
        return colSum; // Returns column total
    }

    // Creates a method that sums the major diagonal in an array,
    // provided an array ('matrix') 
    public static double sumMajorDiagonal(double[][] matrix) {

        double diagSum = 0; // Intitializes total for major diagonal

        // 'For loop' sums all major diagnonal elements across a set of rows 
        for (int row = 0; row < matrix.length; row++) {
            diagSum += matrix[row][row];
        }
        return diagSum; // Returns major diagonal total
    }
}
