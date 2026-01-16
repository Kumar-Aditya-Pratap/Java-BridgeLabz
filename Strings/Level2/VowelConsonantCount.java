import java.util.Scanner;

class VowelConsonantCount {

    static boolean isVowel(char c) {
        c = (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c;
        return "aeiou".indexOf(c) != -1;
    }

    static int[] count(String text) {
        int v = 0, c = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                if (isVowel(ch))
                    v++;
                else
                    c++;
            }
        }
        return new int[] { v, c };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] res = count(sc.nextLine());

        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
        sc.close();
    }
}
