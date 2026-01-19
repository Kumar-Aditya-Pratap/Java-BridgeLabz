package ControlFlows.level2;

import java.util.Scanner;

/**
 * The FizzBuzzFor class implements the classic FizzBuzz challenge.
 * For numbers 1 through n:
 * - Prints "FizzBuzz" if the number is divisible by both 3 and 5.
 * - Prints "Fizz" if divisible by 3.
 * - Prints "Buzz" if divisible by 5.
 * - Prints the number itself if none of the above conditions are met.
 */
class FizzBuzzFor {
    public static void main(String[] args) {

        // Initialize Scanner to capture the upper limit from the user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Ensure the input is a positive integer to start the loop
        if (number > 0) {
            // Iterate from 1 up to and including the user-provided number
            for (int i = 1; i <= number; i++) {

                // Priority Check: Check divisibility by both 3 and 5 first (i.e., divisible by
                // 15)
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if divisible by 3 only
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if divisible by 5 only
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // If not divisible by 3 or 5, print the current number
                else {
                    System.out.println(i);
                }
            }
        }

        // Close the scanner resource
        input.close();
    }
}