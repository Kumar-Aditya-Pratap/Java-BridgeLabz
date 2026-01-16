import java.util.Scanner;

class ShortestLongestWord {

    static int len(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (RuntimeException e) {
            return i;
        }
    }

    static String[] find(String[] words) {
        String min = words[0], max = words[0];
        for (String w : words) {
            if (len(w) < len(min))
                min = w;
            if (len(w) > len(max))
                max = w;
        }
        return new String[] { min, max };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        String[] result = find(words);
        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);
        sc.close();
    }
}
