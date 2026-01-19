package ControlFlows.level1;

import java.util.Scanner;

/**
 * The RocketCountdownWhile class simulates a rocket launch sequence.
 * It takes a starting number from the user and uses a 'while' loop
 * to count down to 1, printing each number in descending order.
 */
class RocketCountdownWhile {
    public static void main(String[] args) {

        // Initialize Scanner to capture the starting point of the countdown
        Scanner input = new Scanner(System.in);

        // Read the initial counter value from the user
        int counter = input.nextInt();

        // Execute the loop as long as the counter is 1 or greater
        while (counter >= 1) {
            // Print the current value of the counter
            System.out.println(counter);

            // Decrement the counter by 1 to move closer to the launch (0)
            counter--;
        }

        // Close the scanner resource
        input.close();
    }
}