import java.util.Scanner;

class StringIndexOutOfBoundsDemo {

    static void generateException(String text) {
        text.charAt(text.length());
    }

    static void handleException(String text) {
        try {
            text.charAt(text.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // generateException(text);
        handleException(text);
        sc.close();
    }
}
