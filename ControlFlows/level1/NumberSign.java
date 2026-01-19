package ControlFlows.level1;

import java.util.Scanner;

/**
 * The NumberSign class evaluates an integer provided by the user to determine
 * its mathematical sign. It categorizes the input into one of three states:
 * positive, negative, or zero using an if-else if-else control structure.
 */
class NumberSign {
    public static void main(String[] args) {

        // Initialize Scanner to capture user input from the console
        Scanner input = new Scanner(System.in);

        // Read the integer to be evaluated
        int number = input.nextInt();

        // Check if the number is strictly greater than zero
        if (number > 0) {
            System.out.println("Positive");
        }
        // Check if the number is strictly less than zero
        else if (number < 0) {
            System.out.println("Negative");
        }
        // If the number is neither greater nor less than zero, it must be zero
        else {
            System.out.println("Zero");
        }

        // Close the scanner to release system resources
        input.close();
    }
}