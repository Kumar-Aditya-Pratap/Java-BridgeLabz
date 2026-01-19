package ControlFlows.level2;

import java.util.Scanner;

/**
 * The MultiplicationTable class generates a specific segment of a
 * multiplication
 * table for a given number. In this implementation, it calculates and displays
 * the products for the multipliers 6, 7, 8, and 9.
 */
class MultiplicationTable {
    public static void main(String[] args) {

        // Initialize Scanner to capture the base number from the user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // The for loop is configured to start at 6 and end at 9
        // i++ ensures we move through the integers 6, 7, 8, and 9
        for (int i = 6; i <= 9; i++) {

            // Calculate the product and print the result in a formatted string
            // number: the user input, i: the current multiplier
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner resource to maintain system efficiency
        input.close();
    }
}