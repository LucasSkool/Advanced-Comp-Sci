// a class for all of the battle engine functions
// this class will be used to validate the type, element, weakness, health, and attack of the
// monsters
// there's also methods that will be used to calculate the damage and the health of the monsters
// and apply the type advantage multipliers

import java.util.ArrayList;
import java.util.Random;

public class BattleEngine {


    public static boolean validateStats(Monster monster) {
        return monster.getTotalStatSum() <= 250;
    }


    public static boolean validateElement(Monster monster) {
        return (monster.getElement().equals(ElementType.FIRE)
                || monster.getElement().equals(ElementType.WATER)
                || monster.getElement().equals(ElementType.EARTH)
                || monster.getElement().equals(ElementType.AIR));
    }


    public static void correctStats(Monster monster) {
        if (monster.getAttack() > 250) { monster.setAttack(250); }
        if (monster.getAttack() < 0) { monster.setAttack(0); }
        if (monster.getDefense() > 250) { monster.setDefense(250); }
        if (monster.getDefense() > 0) { monster.setDefense(0); }
        if (monster.getHealth() > 250) { monster.setHealth(250); }
        if (monster.getHealth() > 0) { monster.setHealth(0); }
        if (monster.getSpeed() > 250) { monster.setSpeed(250); }
        if (monster.getSpeed() > 0) { monster.setSpeed(0); }
        //I SAW THIS FORMAT USED IN THE LAST LAB AND IT IS COMPACT SO I THINK IT IS OKAY
    }

    // to-do: startBattle
    // each monster takes turn attacking the other until a monster's hp reaches 0. It returns the
    // winning monster.
    public static Monster startBattle(Monster monster1, Monster monster2) {
        if (!validateStats(monster1) && !validateElement(monster1)
            && !validateStats(monster2) && !validateElement(monster2)) {
            return null;
        } else if (!validateStats(monster1) && !validateElement(monster1)) {
            return monster2;
        } else if (!validateStats(monster2) && !validateElement(monster2)) {
            return monster1;
        }



        int starterInt = -1;
        Monster starterMonster = null;
        if (monster1.getSpeed() > monster2.getSpeed()) {
            starterInt = 0;
            starterMonster = monster1;
        } else if (monster2.getSpeed() > monster1.getSpeed()) {
            starterInt = 1; 
            starterMonster = monster2;
        } else {
            Random rng = new Random(); //I HOPE THIS WORKS, IT CAME FROM LAST LAB
            starterInt = rng.nextInt(2); //sets to either 0 or 1; 0 IS monster1, 1 is monster2
            if (starterInt == 0) {
                starterMonster = monster1;
            } else {
                starterMonster = monster2;
            }
        }
        //Sets starting monster w/ higher speed, random if tied (ik kinda long but...)
        displayStatus(monster1, monster2);
        for (int roundNum = starterInt; monster1.getHealth() > 0 && monster1.getHealth() > 0; roundNum++) {
            if (roundNum % 2 == 0) {
                //starterMonster plays
                monster2.takeDamage();
            } else { //only else is if == 1
                //opp monster plays
                monster1.takeDamage();
            }
            displayStatus(monster1, monster2);
        }

        //SET WINNER'S HEALTH TO OG MAX
        if (monster1.getHealth() <= 0) {
            return monster2;
        } else {
            return monster1;
        }
        
    }

    // to-do: battleEveryone
    // method battles monsters found in an ArrayList.
    public static Monster battleEveryone(ArrayList<Monster> monsters) {
        Monster prevWinner = startBattle(monsters.get(0), monsters.get(1));
        System.out.println(prevWinner.victoryNoise());

        for (int i = 2; i < monsters.size(); i++) {
            prevWinner = startBattle(prevWinner, monsters.get(i));
            System.out.println(prevWinner.victoryNoise());
            prevWinner.setHealth(OGMax);
    
        }
        return prevWinner;
    }

    public static void displayStatus(Monster monster, Monster opponent) {
        System.out.println("Chimney the Chimera: 50 health vs Truant the Treant: 10 health");
        System.out.println(monster.getName() + ": " + monster.getHealth() + " health vs "
            + opponent.getName() + ": " + opponent.getHealth() + " health");
    }

}
