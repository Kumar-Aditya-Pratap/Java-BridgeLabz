package ControlFlows.level1;

import java.util.Scanner;

/**
 * The SumUntilZeroOrNegative class accumulates a running total of user-entered
 * numbers.
 * It uses an infinite while loop that continues to prompt the user for input
 * until a non-positive number (zero or a negative value) is encountered,
 * which triggers the termination of the loop.
 */
class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        // Initialize Scanner for reading double values from the console
        Scanner input = new Scanner(System.in);

        // Accumulator variable to store the running sum
        double total = 0.0;

        // Enter an infinite loop to collect values
        while (true) {
            // Read the next number from the user
            double value = input.nextDouble();

            // Sentinel check: if the value is 0 or negative, exit the loop immediately
            if (value <= 0) {
                break;
            }

            // Add the positive value to the existing total
            total += value;
        }

        // Display the final accumulated sum to the user
        System.out.println("The total sum is " + total);

        // Close the scanner resource to prevent memory leaks
        input.close();
    }
}