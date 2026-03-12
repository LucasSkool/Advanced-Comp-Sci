public class Chimera extends Monster {
    public Chimera (String name, ElementType element, int health, int attack, int defense, int speed, String attackNameOne, String attackNameTwo, ElementType attackElementOne, ElementType attackElementTwo) {
        super (name, element, health, attack, defense, speed, attackNameOne, attackNameTwo, attackElementOne, attackElementTwo);
    }

    public String victoryNoise() {
        return "I am a Chimera rahhhhh";
    }
}
