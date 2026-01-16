import java.util.Scanner;

class BMICalculator {

    static String bmiStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        if (bmi < 25)
            return "Normal";
        if (bmi < 30)
            return "Overweight";
        return "Obese";
    }

    static String[][] calculate(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100;
            double bmi = weight / (heightM * heightM);

            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(data[i][1]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = bmiStatus(bmi);
        }
        return result;
    }

    static void display(String[][] table) {
        System.out.println("Weight Height BMI Status");
        for (String[] row : table)
            System.out.println(row[0] + " " + row[1] + " " + row[2] + " " + row[3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        display(calculate(data));
        sc.close();
    }
}
