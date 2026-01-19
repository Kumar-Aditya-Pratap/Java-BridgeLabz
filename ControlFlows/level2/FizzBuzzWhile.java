package ControlFlows.level2;

import java.util.Scanner;

/**
 * The FizzBuzzWhile class performs the FizzBuzz sequence using a 'while' loop.
 * It iterates from 1 to a user-defined limit, replacing multiples of 3 with
 * "Fizz",
 * multiples of 5 with "Buzz", and multiples of both with "FizzBuzz".
 */
class FizzBuzzWhile {
    public static void main(String[] args) {

        // Initialize Scanner for reading input
        Scanner input = new Scanner(System.in);

        // Read the upper limit for the FizzBuzz sequence
        int number = input.nextInt();

        // Initialize the loop control variable starting at 1
        int i = 1;

        // Verify the input is positive to avoid an unreachable loop
        if (number > 0) {

            // Loop runs as long as the counter 'i' is less than or equal to the limit
            while (i <= number) {

                // First Priority: Check if 'i' is divisible by both 3 AND 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Second Priority: Check if 'i' is divisible by 3 only
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Third Priority: Check if 'i' is divisible by 5 only
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Final Option: Print the number if no conditions are met
                else {
                    System.out.println(i);
                }

                // Crucial Step: Increment 'i' to move to the next number
                i++;
            }
        }

        // Close the scanner to release resources
        input.close();
    }
}