class DeckOfCards {

    static String[] initialize(String[] suits, String[] ranks) {
        String[] deck = new String[suits.length * ranks.length];
        int k = 0;
        for (String s : suits)
            for (String r : ranks)
                deck[k++] = r + " of " + s;
        return deck;
    }

    static void shuffle(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    static void distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length)
            return;

        int index = 0;
        for (int p = 1; p <= players; p++) {
            System.out.println("Player " + p);
            for (int c = 0; c < cards; c++)
                System.out.println(deck[index++]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        String[] deck = initialize(suits, ranks);
        shuffle(deck);
        distribute(deck, 4, 5);
    }
}
