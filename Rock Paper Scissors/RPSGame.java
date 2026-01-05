import java.util.Scanner;

public class RPSGame {
    // instance variables
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);
    }

    public void start() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scan.nextLine();

        String input = "";
        for (int i = 1; i < 4; i++) {
            System.out.println("Please enter your choice: ");
            String tempInput = scan.nextLine();
            if (RPSGame.validateChoice(tempInput)) {
                input = tempInput;
                i = 999;
            } else {
                System.out.println("You cannot choose that. (Attempts Remaining: " + (3 - i) + ")");
            }
        }
        this.setPlayerValues(name, input); // do I need the "this"???

        // scan.close(); //this just kept giving me issues regarding closing the scanner
        // and stuff
    }

    public boolean didPlayerWin() {
        if (player.getChoice().equals("rock") && opponent.getChoice().equals("scissors")) {
            return true;
        }
        if (player.getChoice().equals("paper") && opponent.getChoice().equals("rock")) {
            return true;
        }
        if (player.getChoice().equals("scissors") && opponent.getChoice().equals("paper")) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (didPlayerWin()) {
            return player.getName() + " won!\nCongratulations!";
        }
        return "Opponent won!\nBetter luck next time!";
    }

    public String displayResults() {
        String result = "== GAME RESULTS ==";
        result += "\n" + player.getName() + " chose " + player.getChoice() + ".";
        result += "\nOpponent chose " + opponent.getChoice() + ".";
        result += "\n" + this.toString();
        return result;

    }

    public static boolean validateChoice(String choice) {
        if (choice.equals("rock")
                || choice.equals("paper")
                || choice.equals("scissors")) {
            return true;
        }
        return false;
    }

    public static String generateRandomChoice() {
        int randomInt = (int) (Math.random() * 3);
        String[] choices = { "rock", "paper", "scissors" };
        return choices[randomInt];
    }
}
