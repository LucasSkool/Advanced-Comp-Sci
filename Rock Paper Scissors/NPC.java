public class NPC {
    private String choice;

    public NPC() {
        this.choice = RPSGame.generateRandomChoice(); //T0D0
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        if (RPSGame.validateChoice(choice.toLowerCase())) {
            this.choice = choice;
        } else {
            this.choice = RPSGame.generateRandomChoice();
        }
    }

    public String toString() {
        return "Opponent chose " + this.choice + ".";
    }
}
