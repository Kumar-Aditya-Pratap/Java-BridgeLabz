import java.util.Scanner;

class RockPaperScissors {

    static String computerChoice() {
        int r = (int) (Math.random() * 3);
        return r == 0 ? "rock" : r == 1 ? "paper" : "scissors";
    }

    static String winner(String user, String comp) {
        if (user.equals(comp))
            return "Draw";
        if (user.equals("rock") && comp.equals("scissors") ||
                user.equals("paper") && comp.equals("rock") ||
                user.equals("scissors") && comp.equals("paper"))
            return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int u = 0, c = 0;

        while (games-- > 0) {
            String user = sc.next();
            String comp = computerChoice();
            String win = winner(user, comp);
            if (win.equals("User"))
                u++;
            if (win.equals("Computer"))
                c++;
        }

        System.out.println("User Wins: " + u);
        System.out.println("Computer Wins: " + c);
        sc.close();
    }
}
