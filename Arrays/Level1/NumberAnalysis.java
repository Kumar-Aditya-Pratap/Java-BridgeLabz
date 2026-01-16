package Arrays.Level1;

import java.util.Scanner;

class NumberAnalysis {
    public static void main(String[] args) {
        // initialising scanner object
        Scanner input = new Scanner(System.in);
        // Initialised array of size 5
        int[] numbers = new int[5];
        // Iterating through the for loop inorder to get the input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0)
                    System.out.println("Positive Even");
                else
                    System.out.println("Positive Odd");
            } else if (numbers[i] < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

        if (numbers[0] == numbers[numbers.length - 1])
            System.out.println("First and Last are Equal");
        else if (numbers[0] > numbers[numbers.length - 1])
            System.out.println("First is Greater");
        else
            System.out.println("Last is Greater");

        input.close();
    }
}
