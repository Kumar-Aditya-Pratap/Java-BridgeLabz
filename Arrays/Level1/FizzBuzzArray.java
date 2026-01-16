package Arrays.Level1;

import java.util.Scanner;

class FizzBuzzArray {
    public static void main(String[] args) {
        // Initialising the scanner object
        Scanner input = new Scanner(System.in);
        // taking number as input
        int number = input.nextInt();
        // Initialised Array
        String[] result = new String[number + 1];
        // Iterating thorugh a for loop
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                result[i] = "FizzBuzz";
            else if (i % 3 == 0)
                result[i] = "Fizz";
            else if (i % 5 == 0)
                result[i] = "Buzz";
            else
                result[i] = String.valueOf(i);
        }
        // Priniting through a for loop
        for (int i = 1; i <= number; i++)
            System.out.println("Position " + i + " = " + result[i]);

        input.close();
    }
}
