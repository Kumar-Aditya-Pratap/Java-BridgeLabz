package ControlFlows.level2;

import java.util.Scanner;

/**
 * The FactorsFor class identifies all proper divisors of a given positive
 * integer.
 * It iterates through all numbers from 1 up to (but not including) the input
 * number,
 * checking if each number divides the input evenly without a remainder.
 */
class FactorsFor {
    public static void main(String[] args) {

        // Initialize Scanner to capture integer input from the user
        Scanner input = new Scanner(System.in);

        // Read the number to find the factors of
        int number = input.nextInt();

        // Ensure the number is positive as factors are typically discussed for natural
        // numbers
        if (number > 0) {
            // Loop from 1 up to number - 1
            for (int i = 1; i < number; i++) {

                // If number divided by i leaves a remainder of 0, i is a factor
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        // Close the scanner resource to release memory
        input.close();
    }
}