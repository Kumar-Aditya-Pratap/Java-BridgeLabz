package ControlFlows.level2;

import java.util.Scanner;

/**
 * The YoungestAndTallest class compares the attributes of three individuals
 * (Amar, Akbar, and Anthony) to determine the minimum age and maximum height.
 * It demonstrates the use of nested Math methods to find extremes among
 * multiple variables.
 */
class YoungestAndTallest {
    public static void main(String[] args) {

        // Initialize Scanner to read age and height data
        Scanner input = new Scanner(System.in);

        // Input ages for the three individuals
        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();

        // Input heights for the three individuals
        double heightAmar = input.nextDouble();
        double heightAkbar = input.nextDouble();
        double heightAnthony = input.nextDouble();

        // Use Math.min nested to find the smallest age among the three
        // It first compares Akbar and Anthony, then compares that result with Amar
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));

        // Use Math.max nested to find the largest height among the three
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        // Output the results to the console
        System.out.println("Youngest age is " + youngestAge);
        System.out.println("Tallest height is " + tallestHeight);

        // Close the scanner resource
        input.close();
    }
}