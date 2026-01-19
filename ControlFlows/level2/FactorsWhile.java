package ControlFlows.level2;

import java.util.Scanner;

/**
 * The FactorsWhile class finds and displays all proper factors of a positive
 * integer.
 * It uses a 'while' loop to iterate through all integers starting from 1 up to
 * the number (exclusive), checking for divisibility using the modulo operator.
 */
class FactorsWhile {
    public static void main(String[] args) {

        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Capture the integer to be analyzed
        int number = input.nextInt();

        // Initialize the counter starting at 1 (the smallest potential factor)
        int counter = 1;

        // Ensure the input number is positive before entering the loop
        if (number > 0) {

            // Iterate as long as the counter is strictly less than the input number
            while (counter < number) {

                // If the remainder is 0, then the counter is a factor of the number
                if (number % counter == 0) {
                    System.out.println(counter);
                }

                // Increment the counter to check the next integer
                counter++;
            }
        }

        // Close the scanner resource
        input.close();
    }
}