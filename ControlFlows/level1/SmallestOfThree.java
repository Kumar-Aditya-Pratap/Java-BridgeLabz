package ControlFlows.level1;

import java.util.Scanner;

/**
 * The SmallestOfThree class determines if the first integer in a set
 * of three is the smallest. It uses logical AND (&&) to verify that
 * the first number is strictly less than both the second and third numbers.
 */
class SmallestOfThree {
    public static void main(String[] args) {

        // Initialize Scanner for capturing input from the console
        Scanner input = new Scanner(System.in);

        // Read three integers to be compared
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Check if number1 is smaller than number2 AND number1 is smaller than number3
        // Both conditions must be true for isSmallest to be true
        boolean isSmallest = number1 < number2 && number1 < number3;

        // Output the boolean result to the user
        System.out.println("Is the first number the smallest? " + isSmallest);

        // Close the scanner resource
        input.close();
    }
}