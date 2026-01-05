public class TheaterMember {
    private String name;
    private boolean[] loyaltyCredits;

    public TheaterMember(String name) {
        this.name = name;
        this.loyaltyCredits = new boolean[10];
    }

    public String getName() {
        return this.name;
    }

    public boolean[] getLoyaltyCredits() {
        return this.loyaltyCredits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    public void grantLoyaltyCredit() { // this is assuming boolean arrays automatically set to false
        boolean done = false;
        for (int i = 0; i < loyaltyCredits.length && !done; i++) {
            if (loyaltyCredits[i] == false) {
                loyaltyCredits[i] = true;
                done = true;
            }
        }
    } // MIGHT NEED EXCEPTIONS HANDLING

    public int countLoyaltyCredits() {
        int count = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                count++;
            }
        }
        return count;
    }

    public String determineMembershipStatus() {
        int totalCredits = this.countLoyaltyCredits();
        if (totalCredits >= 6) {
            return "Gold Member";
        } else if (totalCredits >= 3 && totalCredits <= 5) {
            return "Silver Member";
        }
        return "Plus Member";
    }

    public String loyaltyHistory() {
        String result = "Loyalty History: [";

        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == false) {
                result += "-, ";
            } else {
                result += "X, ";
            }
        }
        result = result.substring(0, result.length() - 2) + "]";

        return result;
    }

    public String toString() {
        return this.name + " (" + this.determineMembershipStatus() + "), " + this.loyaltyHistory();
    }

    public boolean equals(TheaterMember other) {
        boolean loyaltyCreditsMatch = true;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (this.loyaltyCredits[i] != other.loyaltyCredits[i]) {
                loyaltyCreditsMatch = false;
            }
        } // idk if i had to do this but ya know

        if (this.name.equals(other.getName()) && loyaltyCreditsMatch) {
            return true;
        }
        return false;
    }

}
