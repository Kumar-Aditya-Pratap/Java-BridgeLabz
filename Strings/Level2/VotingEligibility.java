class VotingEligibility {

    static String[][] check(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            res[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ages = { 12, 18, 25, 16, 30, 20, 10, 40, 17, 19 };
        String[][] result = check(ages);

        for (String[] r : result)
            System.out.println(r[0] + "\t" + r[1]);
    }
}
