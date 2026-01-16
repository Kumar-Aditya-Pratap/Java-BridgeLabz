import java.util.Scanner;

class TrimStringUsingCharAt {

    static String trimCustom(String s) {
        int start = 0, end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ')
            start++;
        while (end >= start && s.charAt(end) == ' ')
            end--;

        String res = "";
        for (int i = start; i <= end; i++)
            res += s.charAt(i);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(trimCustom(text).equals(text.trim()));
        sc.close();
    }
}
