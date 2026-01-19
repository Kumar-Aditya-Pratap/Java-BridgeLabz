package ControlFlows.level1;

import java.util.Scanner;

/**
 * The FactorialWhile class calculates the factorial of a user-defined positive
 * integer.
 * It employs a 'while' loop to iteratively multiply a running total by a
 * counter
 * variable until the target number is reached.
 * * Mathematical definition: n! = 1 * 2 * 3 * ... * n
 */
class FactorialWhile {
    public static void main(String[] args) {

        // Create a Scanner object to receive input from the user via the console
        Scanner input = new Scanner(System.in);

        // Read the integer for which the factorial needs to be calculated
        int number = input.nextInt();

        // Check if the input is positive; factorials are mathematically defined for
        // non-negative integers
        if (number > 0) {
            // Initialize 'factorial' to 1 (multiplicative identity) and 'i' as the starting
            // counter
            int factorial = 1;
            int i = 1;

            // Execute the loop as long as the counter 'i' is less than or equal to 'number'
            while (i <= number) {
                // Multiply the current product by the counter and update the product
                factorial *= i;

                // Increment the counter to proceed to the next integer
                i++;
            }

            // Display the final result of the calculation
            System.out.println("Factorial is " + factorial);
        }

        // Close the scanner resource to prevent memory leaks
        input.close();
    }
}