package ControlFlows.level2;

import java.util.Scanner;

/**
 * The GreatestFactorFor class finds the largest proper factor of a given
 * integer.
 * A proper factor is a divisor of the number other than the number itself.
 * The program optimizes the search by iterating backwards from (number - 1)
 * and stopping as soon as the first divisor is found.
 */
class GreatestFactorFor {
    public static void main(String[] args) {

        // Initialize Scanner for reading input
        Scanner input = new Scanner(System.in);

        // Read the number to be analyzed
        int number = input.nextInt();

        // Default greatest factor is 1 (every positive integer is divisible by 1)
        int greatestFactor = 1;

        // Optimization: Start from number - 1 and count downwards
        // The first number that divides 'number' evenly will be the greatest factor
        for (int i = number - 1; i >= 1; i--) {

            // Check if 'i' is a factor using the modulo operator
            if (number % i == 0) {
                // Assign the found value to greatestFactor
                greatestFactor = i;

                // Exit the loop immediately to save processing time
                break;
            }
        }

        // Display the result
        System.out.println("Greatest factor is " + greatestFactor);

        // Close the scanner resource
        input.close();
    }
}