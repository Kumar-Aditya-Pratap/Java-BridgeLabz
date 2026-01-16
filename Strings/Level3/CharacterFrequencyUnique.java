import java.util.Scanner;

class CharacterFrequencyUnique {

    static String[][] frequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        char[] unique = UniqueCharacters.unique(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] res = frequency(sc.nextLine());

        for (String[] r : res)
            System.out.println(r[0] + " : " + r[1]);

        sc.close();
    }
}
