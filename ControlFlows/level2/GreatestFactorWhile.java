package ControlFlows.level2;

import java.util.Scanner;

/**
 * The GreatestFactorWhile class identifies the largest proper divisor of a
 * number.
 * By using a 'while' loop to count downwards from (number - 1), the program
 * ensures that the first factor it encounters is the largest possible one,
 * allowing for an early exit via the 'break' statement.
 */
class GreatestFactorWhile {
    public static void main(String[] args) {

        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Read the target number from the user
        int number = input.nextInt();

        // Default greatest factor is 1, as 1 divides all integers
        int greatestFactor = 1;

        // Start the counter at one less than the number to find proper factors
        int counter = number - 1;

        // Loop runs as long as the counter is 1 or greater
        while (counter >= 1) {

            // If the number is divisible by the current counter, we found our factor
            if (number % counter == 0) {
                // Update the greatestFactor variable
                greatestFactor = counter;

                // Exit the loop immediately since we are counting down from the top
                break;
            }

            // Decrement the counter to check the next smaller integer
            counter--;
        }

        // Output the result of the calculation
        System.out.println("Greatest factor is " + greatestFactor);

        // Close the scanner resource to maintain good memory management
        input.close();
    }
}