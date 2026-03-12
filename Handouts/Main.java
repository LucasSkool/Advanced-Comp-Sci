import java.util.ArrayList;

public class Main {

    /**
     * Return an ArrayList of monsters for automated testing.
     * Populate this with your created monsters (e.g. Chimera, custom subclasses).
     */
    public static ArrayList<Monster> getMonstersForTest() {

        ArrayList<Monster> list = new ArrayList<>();
        // TODO: Add your monsters here (required for auto tester).

        return list;
    }

    public static void main(String[] args) {

        // Run a tournament using monsters from getMonstersForTest():
        Monster winner = BattleEngine.battleEveryone(Main.getMonstersForTest());
        System.out.println("Winner: " + (winner != null ? winner.getName() : "None"));
        
    }
}
