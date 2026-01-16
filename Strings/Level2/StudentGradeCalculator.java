class StudentGradeCalculator {

    static int[][] scores() {
        int[][] s = new int[5][3];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 3; j++)
                s[i][j] = 50 + (int) (Math.random() * 50);
        return s;
    }

    static char grade(double p) {
        if (p >= 90)
            return 'A';
        if (p >= 75)
            return 'B';
        if (p >= 60)
            return 'C';
        return 'D';
    }

    public static void main(String[] args) {
        int[][] s = scores();
        for (int i = 0; i < s.length; i++) {
            int total = s[i][0] + s[i][1] + s[i][2];
            double percent = Math.round((total / 3.0) * 100.0) / 100.0;
            System.out.println(total + "\t" + percent + "\t" + grade(percent));
        }
    }
}
