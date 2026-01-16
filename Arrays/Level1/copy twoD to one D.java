package Arrays.Level1;

import java.util.Scanner;

class Copy2DTo1D {
    public static void main(String[] args) {
        // Taking Input
        Scanner input = new Scanner(System.in);
        // taking rows and coloumns
        int rows = input.nextInt();
        int cols = input.nextInt();
        // initialising the matrix
        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];
        int index = 0;
        // iterating through a for Loop!
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
                array[index++] = matrix[i][j];
            }
        }
        // printing the matrix using a for loop
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        input.close();
    }
}
