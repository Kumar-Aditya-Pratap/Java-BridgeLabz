package ControlFlows.level1;

import java.util.Scanner;

/**
 * The NaturalNumberSum class calculates the sum of the first 'n' natural
 * numbers.
 * Instead of using a loop, it utilizes the efficient mathematical formula:
 * Sum = n * (n + 1) / 2
 * This approach provides a constant time complexity O(1) solution.
 */
class NaturalNumberSum {
    public static void main(String[] args) {

        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Read the integer up to which the sum is to be calculated
        int number = input.nextInt();

        // Natural numbers are positive integers (1, 2, 3...)
        if (number > 0) {
            // Apply Gauss's formula to calculate the sum efficiently
            int sum = number * (number + 1) / 2;

            // Output the result of the calculation
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Provide feedback if the input does not meet the criteria for natural numbers
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the scanner to release system resources
        input.close();
    }
}