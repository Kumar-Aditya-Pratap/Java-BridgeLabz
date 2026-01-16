package Arrays.Level1;

import java.util.Scanner;

class MultiplicationTable6To9 {
    public static void main(String[] args) {
        // Initialising the Scanner object
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        // Initialised an Array of size 4
        int[] results = new int[4];
        // Iterating through a for loop for calculating the table
        for (int i = 6, j = 0; i <= 9; i++, j++) {
            results[j] = number * i;
        }
        // iterating through a for loop to printout the table
        for (int i = 6, j = 0; i <= 9; i++, j++) {
            System.out.println(number + " * " + i + " = " + results[j]);
        }

        input.close();
    }
}
