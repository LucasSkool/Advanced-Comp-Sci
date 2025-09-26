public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public int computeTotalEmployees() {
        return numberOfLoanOfficers + numberOfTellers;
    }

    public String toString() {
        return "This bank has " + numberOfLoanOfficers
            + " loan officers, and " + numberOfTellers + " tellers.";
    }

    public boolean equals(Bank other) {
        return (this.numberOfLoanOfficers == other.getNumberOfLoanOfficers()
            && this.numberOfTellers == other.getNumberOfTellers());
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers += numberToHire;
        } else {
            numberOfTellers += numberToHire;
        }
    }

    
    // Stretch Challence Methods

    public double getEmployeeRatio() {
        return (double) numberOfLoanOfficers / (double) numberOfTellers;
    }

    public void fireMembers(int numberToFire, boolean isLoanOfficer) {
        if (isLoanOfficer && numberToFire <= numberOfLoanOfficers) {
            numberOfLoanOfficers -= numberToFire;
        } else if (numberToFire > numberOfLoanOfficers) {
            System.out.println("You physically cannot fire that many loan officers.");
        }
        
        if (!isLoanOfficer && numberToFire <= numberOfTellers) {
            numberOfTellers -= numberToFire;
        } else if (numberToFire > numberOfTellers) {
            System.out.println("You physically cannot fire that many tellers.");
        }

    }

    public void transferEmployee(boolean fromLoanOfficer) {
        if (fromLoanOfficer) {
            numberOfLoanOfficers--;
            numberOfTellers++;
        } else {
            numberOfLoanOfficers++;
            numberOfTellers--;
        }
    }

    public int estimateSallary() {
        return (75000 * numberOfLoanOfficers) + (45000 * numberOfTellers);
    }
}

