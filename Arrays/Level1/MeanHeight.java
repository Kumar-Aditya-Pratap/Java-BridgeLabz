package Arrays.Level1;

import java.util.Scanner;

class MeanHeight {
    public static void main(String[] args) {
        // Initialised the scanner object
        Scanner input = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0;
        // Iterating through the For loop!
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        // printing out the output
        System.out.println("Mean Height = " + mean);

        input.close();
    }
}
