import java.util.Scanner;

class PalindromeCheck {

    static boolean check(String s, int start, int end) {
        if (start >= end)
            return true;
        if (s.charAt(start) != s.charAt(end))
            return false;
        return check(s, start + 1, end - 1);
    }

    static boolean checkArray(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length / 2; i++)
            if (arr[i] != arr[arr.length - 1 - i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(check(text, 0, text.length() - 1));
        System.out.println(checkArray(text));
        sc.close();
    }
}
