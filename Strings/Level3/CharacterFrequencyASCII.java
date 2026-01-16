import java.util.Scanner;

class CharacterFrequencyASCII {

    static String[][] frequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        int count = 0;
        for (int i = 0; i < 256; i++)
            if (freq[i] > 0)
                count++;

        String[][] result = new String[count][2];
        int k = 0;

        for (int i = 0; i < 256; i++)
            if (freq[i] > 0) {
                result[k][0] = String.valueOf((char) i);
                result[k][1] = String.valueOf(freq[i]);
                k++;
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
