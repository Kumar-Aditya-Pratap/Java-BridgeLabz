package Arrays.Level1;

import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        // Initialised Scanner object
        Scanner input = new Scanner(System.in);
        // Created an array of type int and of size 10
        int[] ages = new int[10];
        // running the loop from 0 to arry size and taking input one by one
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();

            if (ages[i] < 0) {
                System.out.println("Invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote");
            }
        }

        input.close();
    }
}
