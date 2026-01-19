package ControlFlows.level1;

import java.util.Scanner;

/**
 * The LargestOfThree class accepts three integers from the user and 
 * performs boolean comparisons to check which number is the greatest.
 * It evaluates each number against the others using logical AND (&&) 
 * operators to determine the largest value.
 */
class LargestOfThree {
    public static void main(String[] args) {

        // Initialize Scanner for reading integer inputs
        Scanner input = new Scanner(System.in);

        // Capture three separate integers from the user
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Block 1: Check if the first number is greater than both number2 and number3
        System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3));
        
        // Block 2: Check if the second number is greater than both number1 and number3
        System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3));
        
        // Block 3: Check if the third number is greater than both number1 and number2
        System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2));

        // Close the scanner resource
        input.close();
    }
}