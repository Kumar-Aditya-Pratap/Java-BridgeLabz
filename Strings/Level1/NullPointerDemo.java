class NullPointerDemo {

    static void generateException() {
        String text = null;
        text.length(); // exception
    }

    static void handleException() {
        try {
            String text = null;
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {
        // generateException(); // uncomment to see crash
        handleException();
    }
}
