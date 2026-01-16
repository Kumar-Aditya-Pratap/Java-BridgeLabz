package Arrays.Level1;

import java.util.Scanner;

class OddEvenArrays {
    public static void main(String[] args) {
        // Initialised Scanner object
        Scanner input = new Scanner(System.in);
        // taking Input
        int number = input.nextInt();
        // checking whether the number is negative or positive
        if (number <= 0) {
            System.out.println("Invalid Number");
            return;
        }
        // creating two arrays named Odd and Even with half of the initialised length
        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];
        int e = 0, o = 0;
        // now updating the arrays based on whter they are odd or even
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                even[e++] = i;
            else
                odd[o++] = i;
        }

        System.out.println("Odd Numbers:");
        for (int i = 0; i < o; i++)
            System.out.print(odd[i] + " ");

        System.out.println("\nEven Numbers:");
        for (int i = 0; i < e; i++)
            System.out.print(even[i] + " ");

        input.close();
    }
}
