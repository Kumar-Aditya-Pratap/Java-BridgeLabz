package ControlFlows.level2;

import java.util.Scanner;

/**
 * The MultiplesBelow100While class finds and prints all multiples of a given
 * number that are less than or equal to 100. It processes the range in
 * descending order using a while loop.
 */
class MultiplesBelow100While {
    public static void main(String[] args) {

        // Initialize Scanner for capturing user input
        Scanner input = new Scanner(System.in);

        // Read the base number to check for multiples
        int number = input.nextInt();

        // Initialize the counter at the maximum limit (100)
        int counter = 100;

        // Validation: Ensure the number is positive and within the 1-99 range
        if (number > 0 && number < 100) {

            // Loop runs as long as the counter hasn't reached the bottom of the range
            while (counter >= 1) {

                // If counter divided by number has no remainder, it is a multiple
                if (counter % number == 0) {
                    System.out.println(counter);
                }

                // Move the counter down by 1 in each iteration
                counter--;
            }
        }

        // Close the scanner resource
        input.close();
    }
}