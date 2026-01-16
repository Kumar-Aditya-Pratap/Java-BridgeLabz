import java.util.Scanner;

class UniqueCharacters {

    static int length(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
            return i;
        }
    }

    static char[] unique(String text) {
        int len = length(text);
        char[] temp = new char[len];
        int k = 0;

        for (int i = 0; i < len; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++)
                if (text.charAt(i) == text.charAt(j))
                    unique = false;

            if (unique)
                temp[k++] = text.charAt(i);
        }

        char[] result = new char[k];
        for (int i = 0; i < k; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] res = unique(sc.nextLine());

        for (char c : res)
            System.out.print(c + " ");

        sc.close();
    }
}
