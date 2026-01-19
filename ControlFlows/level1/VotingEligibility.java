package ControlFlows.level1;

import java.util.Scanner;

/**
 * The VotingEligibility class checks if a person is eligible to vote
 * based on their age. It follows the standard legal requirement where
 * a person must be 18 years or older to participate in an election.
 */
class VotingEligibility {
    public static void main(String[] args) {

        // Initialize Scanner to capture age input from the console
        Scanner input = new Scanner(System.in);

        // Read the user's age as an integer
        int age = input.nextInt();

        // Comparison: if the age is 18 or greater, the condition is true
        if (age >= 18) {
            // Executed if the age meets the requirement
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // Executed if the age is less than 18
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the scanner to release system resources
        input.close();
    }
}