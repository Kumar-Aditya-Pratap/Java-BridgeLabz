package ControlFlows.level1;

import java.util.Scanner;

/**
 * The FactorialFor class calculates the factorial of a positive integer.
 * Factorial (n!) is the product of all positive integers from 1 up to n.
 * This implementation uses a 'for' loop to iteratively multiply the numbers.
 */
class FactorialFor {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Read the integer from which the factorial will be calculated
        int number = input.nextInt();

        // Check if the number is positive; factorial is generally defined for
        // non-negative integers
        if (number >= 0) {
            // Initialize factorial to 1 (the identity for multiplication)
            int factorial = 1;

            // Loop from 1 up to the given number, multiplying the current total by the loop
            // index
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Equivalent to factorial = factorial * i
            }

            // Output the final calculated result
            System.out.println("Factorial is " + factorial);
        } else {
            // Handle cases where the input is a negative integer
            System.out.println("Factorial is not defined for negative numbers.");
        }

        // Close the scanner to release system resources
        input.close();
    }
}