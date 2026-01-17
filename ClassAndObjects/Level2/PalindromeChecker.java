/*
 This class checks whether a given string is a palindrome.
*/
class PalindromeChecker {

    private String text; // input text

    PalindromeChecker(String text) { // constructor
        this.text = text;
    }

    boolean isPalindrome() { // checks palindrome condition
        return text.equals(new StringBuilder(text).reverse().toString());
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("madam"); // creating object
        System.out.println(checker.isPalindrome()); // displaying result
    }
}
