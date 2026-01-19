package ControlFlows.level2;

import java.util.Scanner;

/**
 * The EmployeeBonus class calculates a 5% holiday or performance bonus
 * for employees. The bonus is only applicable if the employee has
 * more than 5 years of service with the company.
 */
class EmployeeBonus {
    public static void main(String[] args) {

        // Initialize Scanner to capture salary and service duration
        Scanner input = new Scanner(System.in);

        // Read the employee's current salary and their total years of service
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();

        // Initialize bonus to 0; it stays 0 if the condition isn't met
        double bonus = 0;

        // Eligibility check: bonus is only granted if service is strictly greater than
        // 5 years
        if (yearsOfService > 5) {
            // Calculate 5% of the salary (0.05 is the decimal equivalent of 5%)
            bonus = salary * 0.05;
        }

        // Display the calculated bonus amount
        System.out.println("The bonus amount is " + bonus);

        // Close the scanner resource
        input.close();
    }
}