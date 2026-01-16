import java.util.Scanner;

class ToUpperCaseCompare {

    static String toUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z')
                result += (char) (c - 32);
            else
                result += c;
        }
        return result;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length())
            return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i))
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String custom = toUpper(text);
        String builtIn = text.toUpperCase();

        System.out.println(compare(custom, builtIn));
        sc.close();
    }
}
