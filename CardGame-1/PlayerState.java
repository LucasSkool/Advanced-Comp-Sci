import java.util.ArrayList;

public class PlayerState {
    String name;
    ArrayList<Card> deck;
    Card active;
    int pendingDamage; // used by RIPPLE when opponent has no active card

    PlayerState(String name, ArrayList<Card> deck) {
        this.name = name;
        this.deck = deck;
        this.active = null;
        this.pendingDamage = 0;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Card> getDeck() {
        return this.deck;
    }

    public Card getActive() {
        return active;
    }

    public int getPendingDamage() {
        return pendingDamage;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public void setActive(Card active) {
        this.active = active;
    }

    public void setPendingDamage(int pendingDamage) {
        this.pendingDamage = pendingDamage;
    }

    
    boolean hasAnythingLeft() {
        return active != null || (deck != null && !deck.isEmpty());
    }
}