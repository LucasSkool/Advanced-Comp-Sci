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
        
        System.out.println("Please enter your name: " );
        String name = scan.nextLine();
        
        String input = "";
        for (int i = 1; i < 4; i++) {
            String tempInput = scan.nextLine();
            if (RPSGame.validateChoice(tempInput)) {
                input = tempInput;
                i = 999;
            } else {
                System.out.println("You cannot choose that. Please try again (Attempts Remaining: " + (3 - i) + "):");
            }
        }
        this.setPlayerValues(name, input); //do I need the "this"???
        scan.close();
    }

    public boolean didPlayerWin() {
        if (player.getChoice().equals("rock"))
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
        int randomInt = (int) (Math.random() * 3 + 1);
        String [] choices = {"rock", "paper", "scissors"};
        return choices[randomInt];
    }
}
