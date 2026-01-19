package ControlFlows.level1;

import java.util.Scanner;

/**
 * The NaturalSumCompareFor class calculates the sum of the first 'n' natural
 * numbers
 * using two different methods: an iterative 'for' loop and the mathematical
 * formula.
 * This comparison demonstrates that both approaches yield the same result,
 * illustrating the difference between O(n) and O(1) time complexities.
 */
class NaturalSumCompareFor {
    public static void main(String[] args) {

        // Initialize Scanner for reading the user's input
        Scanner input = new Scanner(System.in);

        // Read the target number n for the sum calculation
        int n = input.nextInt();

        // Check if the input is a valid natural number (positive integer)
        if (n > 0) {

            // Method 1: Iterative approach using a 'for' loop
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i; // Add the current index 'i' to the running total
            }

            // Method 2: Mathematical approach using the summation formula
            int sumFormula = n * (n + 1) / 2;

            // Output both results to verify they match
            System.out.println("For Loop Sum: " + sumLoop);
            System.out.println("Formula Sum: " + sumFormula);
        }

        // Close the scanner resource to maintain good practice
        input.close();
    }
}