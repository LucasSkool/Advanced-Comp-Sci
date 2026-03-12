import java.util.ArrayList;
import java.util.Scanner;

public class DecksAndChecks {

    // ----------------------------
    // CHECKERS (students implement)
    // ----------------------------

    // Rule: no single card may have more than 1 ability
    public static boolean checkOneAbilityPerCard(ArrayList<Card> deck) {
        for (Card card : deck) {
            if (card.abilityCount() > 1) {
                return false;
            }
        }
        return true;
    }

    // Rule: no more than 3 total ability cards in the deck
    public static boolean checkNoMoreThanThreeAbilityCards(ArrayList<Card> deck) {
        int abilityCardsCount = 0;
        for (Card card : deck) {
            if (card.abilityCount() > 0) {
                abilityCardsCount++;
            }
        }
        if (abilityCardsCount > 3) {
            return false;
        }
        return true;
    }

    // Rule: no duplicate abilities in the deck (max one BASTION, one RIPPLE, one CLEAVE)
    public static boolean checkNoDuplicateAbilities(ArrayList<Card> deck) {
        Ability[] abilities = {AbilityLibrary.BASTION, AbilityLibrary.RIPPLE, AbilityLibrary.CLEAVE};
        
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (Card card : deck) { //for each card in the deck...
                if (card.resolvedAbility().equals(abilities[i])) {
                    count++;
                }
            }
            if (count > 1) {
                return false;
            }
        }
        return true;

    }

    // Rule: strength and toughness must be 1..5, and strength+toughness <= 6
    public static boolean checkStatsInRange(ArrayList<Card> deck) {
        for (Card card : deck) {
            if (card.getStrength() < 1 || card.getStrength() > 5
                || card.getToughness() < 1 || card.getToughness() > 5
                || card.getStrength() + card.getToughness() > 6) {
                    return false;
            }
        }
        return true;
    }

    public static boolean isValidDeck(ArrayList<Card> deck) {
        if (deck.size() != 5
            || !checkOneAbilityPerCard(deck)
            || !checkNoMoreThanThreeAbilityCards(deck)
            || !checkNoDuplicateAbilities(deck)
            || !checkStatsInRange(deck)) {
                return false;
        }
        return true;
    }

    // ----------------------------
    // DECK BUILDERS (students implement)
    // ----------------------------

    // Must create 5 cards, all 3/3, no abilities
    // If the user doesn't want to input a custom deck, this method should return deck
    //   of your choice for them to play with.
    public static ArrayList<Card> buildDefaultDeck() {
        ArrayList<Card> defaultDeck = new ArrayList<>(5); //apparently don't need "card" in second ArrayList<>
        defaultDeck.add(new NamedCard("card1", CardType.GRANITE, 3, 3, false, false, false));
        defaultDeck.add(new NamedCard("card2", CardType.PARCHMENT, 3, 3, false, false, false));
        defaultDeck.add(new NamedCard("card3", CardType.BLADE, 3, 3, false, false, false));
        defaultDeck.add(new NamedCard("card4", CardType.GRANITE, 3, 3, false, false, false));
        defaultDeck.add(new NamedCard("card5", CardType.PARCHMENT, 3, 3, false, false, false));

        return defaultDeck;
    }

    // Prompts the user 5 times using Scanner and validates inputs.
    // Required prompt order per card:
    // name, type, strength, toughness, bastion(y/n), ripple(y/n), cleave(y/n)
    public static ArrayList<Card> buildUserDeck(Scanner sc) {
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

        if (!isValidDeck(builtDeck)) {
            throw new IllegalArgumentException("One of your imputs was illegal."); 
            //idk if CodeCheck wants me to throw an exception here
        }
        return builtDeck;

    }

    // ----------------------------
    // Optional helpers you may use
    // ----------------------------

    public static boolean isYes(String s) {
        if (s == null) return false;
        s = s.trim().toLowerCase();
        return s.equals("y") || s.equals("yes");
    }
}
