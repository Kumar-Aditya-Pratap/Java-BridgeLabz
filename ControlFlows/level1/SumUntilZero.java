package ControlFlows.level1;

import java.util.Scanner;

/**
 * The SumUntilZero class continuously accepts numeric input from the user
 * and maintains a running total. The program utilizes an infinite loop
 * (while true) that only terminates when the user enters '0', at which
 * point the final sum is displayed.
 */
class SumUntilZero {
    public static void main(String[] args) {

        // Initialize Scanner for reading double-precision floating-point numbers
        Scanner input = new Scanner(System.in);

        // Variable to store the accumulated sum
        double total = 0.0;

        // Start an infinite loop to collect numbers indefinitely
        while (true) {
            // Read the next number from the user
            double value = input.nextDouble();

            // Sentinel value check: if the input is 0, exit the loop immediately
            if (value == 0) {
                break;
            }

            // Add the valid input value to the running total
            total += value;
        }

        // Display the calculated sum after the loop terminates
        System.out.println("The total sum is " + total);

        // Close the scanner resource to prevent memory leaks
        input.close();
    }
}