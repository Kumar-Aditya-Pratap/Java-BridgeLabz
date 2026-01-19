package ControlFlows.level1;

import java.util.Scanner;

/**
 * The RocketCountdownWhile class simulates a rocket launch sequence.
 * It accepts a starting integer from the user and uses a 'while' loop
 * to print a descending countdown from that number down to 1.
 */
class RocketCountdownWhile {
    public static void main(String[] args) {

        // Initialize Scanner to capture user input from the console
        Scanner input = new Scanner(System.in);

        // Read the starting point of the countdown
        int counter = input.nextInt();

        // Execution continues as long as the counter is greater than or equal to 1
        while (counter >= 1) {
            // Display the current countdown number
            System.out.println(counter);

            // Decrement the counter to move toward the termination condition (0)
            counter--;
        }

        // Close the scanner resource to maintain memory efficiency
        input.close();
    }
}