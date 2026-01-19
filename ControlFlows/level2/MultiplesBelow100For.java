package ControlFlows.level2;

import java.util.Scanner;

/**
 * The MultiplesBelow100For class identifies all multiples of a user-provided
 * number that fall between 1 and 100. It iterates backwards from 100 to 1,
 * ensuring the multiples are displayed in descending order.
 */
class MultiplesBelow100For {
    public static void main(String[] args) {

        // Initialize Scanner to capture input from the console
        Scanner input = new Scanner(System.in);

        // Read the number to find multiples for
        int number = input.nextInt();

        // Validation: Only proceed if the number is within a reasonable range (1-99)
        if (number > 0 && number < 100) {

            // Loop backwards from 100 down to 1
            for (int i = 100; i >= 1; i--) {

                // If the current index 'i' is divisible by 'number', it is a multiple
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }

        // Close the scanner resource to free memory
        input.close();
    }
}