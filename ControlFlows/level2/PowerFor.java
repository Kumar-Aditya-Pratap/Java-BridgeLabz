package ControlFlows.level2;

import java.util.Scanner;

/**
 * The PowerFor class calculates the power of a number (base^exponent).
 * It uses a for loop to perform repeated multiplication, which is the
 * fundamental definition of exponentiation for positive integers.
 */
class PowerFor {
    public static void main(String[] args) {

        // Initialize Scanner to capture base and exponent from the user
        Scanner input = new Scanner(System.in);

        // The 'number' acts as the base, and 'power' acts as the exponent
        int number = input.nextInt();
        int power = input.nextInt();

        // Initialize result to 1 (the identity element for multiplication)
        int result = 1;

        // The loop runs 'power' number of times
        for (int i = 1; i <= power; i++) {
            // Multiply the current result by the base in each iteration
            result *= number;
        }

        // Output the final calculation
        System.out.println("Result is " + result);

        // Close the scanner resource
        input.close();
    }
}