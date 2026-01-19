package ControlFlows.level2;

import java.util.Scanner;

/**
 * The OddEvenPrinter class iterates from 1 up to a user-specified number.
 * For each integer in the range, it determines if the number is even or odd
 * using the modulo operator and prints the result accordingly.
 */
class OddEvenPrinter {
    public static void main(String[] args) {

        // Initialize Scanner to capture user input
        Scanner input = new Scanner(System.in);

        // Read the upper limit for the sequence
        int number = input.nextInt();

        // Validation: Ensure the number is positive before starting the loop
        if (number > 0) {

            // Loop from 1 up to and including the input number
            for (int i = 1; i <= number; i++) {

                // Parity check: If the remainder when divided by 2 is zero, it is even
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                }
                // Otherwise, the number must be odd
                else {
                    System.out.println(i + " is Odd");
                }
            }
        }

        // Close the scanner resource to release memory
        input.close();
    }
}