import java.util.Scanner;

class WordsWithLength2D {

    static int length(String word) {
        int c = 0;
        try {
            while (true) {
                word.charAt(c);
                c++;
            }
        } catch (RuntimeException e) {
            return c;
        }
    }

    static String[][] mapWords(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(length(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        String[][] table = mapWords(words);
        for (String[] row : table)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));

        sc.close();
    }
}
