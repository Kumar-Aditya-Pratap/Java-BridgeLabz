package ControlFlows.level2;

import java.util.Scanner;

/**
 * The PowerWhile class calculates the result of a base raised to an exponent.
 * It uses a while loop to perform repeated multiplication.
 * This approach demonstrates how to manage a counter manually to achieve
 * exponentiation logic.
 */
class PowerWhile {
    public static void main(String[] args) {

        // Initialize Scanner for reading base and exponent input
        Scanner input = new Scanner(System.in);

        // 'number' is the base, 'power' is the exponent
        int number = input.nextInt();
        int power = input.nextInt();

        // Initialize result to 1 (multiplicative identity)
        int result = 1;

        // Initialize counter to track the number of multiplications performed
        int counter = 0;

        // The loop continues until the counter reaches the value of the power
        while (counter < power) {
            // Multiply the current result by the base
            result *= number;

            // Increment the counter to avoid an infinite loop
            counter++;
        }

        // Output the final result
        System.out.println("Result is " + result);

        // Close the scanner resource
        input.close();
    }
}