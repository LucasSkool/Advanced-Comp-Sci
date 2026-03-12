import java.util.ArrayList;
import java.util.Random;

import java.util.Scanner;

public class CardTester {

    
    public static void main(String[] args) {
        System.out.println("== LOCAL CARD TESTER ==");
        
        Card a = new NamedCard("Alpha", CardType.GRANITE, 3, 3, true, false, false);
        // Bastion
        Card b = new NamedCard("Bravo", CardType.BLADE, 3, 3, false, false, true); 
        //Cleave
        
        // simulate "play" (self effects only)
        a.applySelfOnPlay(a.resolvedAbility());
        b.applySelfOnPlay(b.resolvedAbility());
        
        System.out.println("A played: " + a);
        System.out.println("B played: " + b);
        
        int dmg = a.computeDamageAgainst(b);
        System.out.println("A attacks B for " + dmg);
        b.takeDamage(dmg);
        System.out.println("B after dmg: " + b);
        
        // Optional: run your full game if DeckAndChecks + CardBattleGame exist
        try {
        ArrayList<Card> player = BotFactory.buildBotDeck(); // placeholder deck
        ArrayList<Card> bot = BotFactory.buildBotDeck();
        
        System.out.println("\n== RUNNING GAME (if implemented) ==");
        String winner = CardBattleGame.playGame(player, bot, new Random(7));
        System.out.println("Returned winner: " + winner);
        } catch (Throwable t) {
        System.out.
        println("\n(Game not run: CardBattleGame/DeckAndChecks may still be TODO)");
        }
    }
     

    /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Card> builtDeck = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) { // 5 cycles
            System.out.println("Card name?: ");
            String name = sc.next();
            System.out.println("Card type?: ");
            CardType type = CardType.fromText(sc.next()); // account for case
            System.out.println("Card strength?: ");
            int strength = sc.nextInt();
            System.out.println("Card toughness?: ");
            int toughness = sc.nextInt();
            System.out.println("Is the card a BASTION? (y/n): ");
            boolean bastion = DecksAndChecks.isYes(sc.next());
            System.out.println("Is the card a RIPPLE? (y/n): ");
            boolean ripple = DecksAndChecks.isYes(sc.next());
            System.out.println("Is the card a CLEAVE? (y/n): ");
            boolean cleave = DecksAndChecks.isYes(sc.next());

            builtDeck.add(new NamedCard(name, type, strength, toughness, bastion, ripple, cleave));
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(builtDeck.get(i) + " ");
        }
    }*/

}