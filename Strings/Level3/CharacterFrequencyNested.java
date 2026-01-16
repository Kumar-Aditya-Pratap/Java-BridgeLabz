import java.util.Scanner;

class CharacterFrequencyNested {

    static String[] frequency(String text) {
        char[] arr = text.toCharArray();
        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = '0';
                }
            }
        }

        int count = 0;
        for (char c : arr)
            if (c != '0')
                count++;

        String[] res = new String[count];
        int k = 0;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] != '0')
                res[k++] = arr[i] + " : " + freq[i];

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] res = frequency(sc.nextLine());

        for (String r : res)
            System.out.println(r);

        sc.close();
    }
}
