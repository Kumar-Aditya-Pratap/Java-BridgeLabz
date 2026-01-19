package ControlFlows.level1;

import java.util.Scanner;

/**
 * The RocketCountdownFor class simulates a rocket launch sequence using a 'for'
 * loop.
 * It takes an initial value from the user and counts down to 1 by decrementing
 * the loop variable in each iteration.
 */
class RocketCountdownFor {
    public static void main(String[] args) {

        // Initialize Scanner to capture user input
        Scanner input = new Scanner(System.in);

        // Read the starting number for the countdown
        int counter = input.nextInt();

        // Step-based loop:
        // 1. Initialization: starts at the user-provided counter
        // 2. Condition: continues as long as i is 1 or greater
        // 3. Update: decreases i by 1 after each iteration
        for (int i = counter; i >= 1; i--) {
            // Print the current value of the countdown
            System.out.println(i);
        }

        // Close the scanner to free up memory
        input.close();
    }
}