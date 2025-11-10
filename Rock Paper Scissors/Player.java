public class Player {
    private String name;
    private String choice;

    public String getName() {
        return this.name;
    }

    public String getChoice() {
        return choice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChoice(String choice) {
        if (RPSGame.validateChoice(choice.toLowerCase())) {
            this.choice = choice;
        } else {
            this.choice = RPSGame.generateRandomChoice();
        }
    }

    public String toString() {
        return this.name + " chose " + this.choice + ".";
    }
}
