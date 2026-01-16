import java.util.Scanner;

class VowelConsonantType {

    static String type(char c) {
        c = (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c;
        if (c < 'a' || c > 'z')
            return "Not a Letter";
        return "aeiou".indexOf(c) != -1 ? "Vowel" : "Consonant";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++)
            System.out.println(text.charAt(i) + " - " + type(text.charAt(i)));

        sc.close();
    }
}
