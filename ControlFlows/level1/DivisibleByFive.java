package ControlFlows.level1;

import java.util.Scanner;

/**
 * The DivisibleByFive class determines if a user-provided integer
 * is divisible by 5. It utilizes the modulo operator to check
 * for a remainder of zero and outputs a boolean result.
 */
class DivisibleByFive {
    public static void main(String[] args) {

        // Initialize Scanner to capture input from the standard input stream
        Scanner input = new Scanner(System.in);

        // Read the integer to be checked
        int number = input.nextInt();

        // Check divisibility: if the remainder when divided by 5 is 0, it is divisible
        boolean divisible = number % 5 == 0;

        // Output the result as a descriptive string including the boolean value
        System.out.println("Is the number " + number + " divisible by 5? " + divisible);

        // Close the scanner to release resources
        input.close();
    }
}