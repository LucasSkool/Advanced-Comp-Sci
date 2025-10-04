public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;
    
    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        this.dogChar = generateDogChar();
        this.dogTag = generateDogTag();
        this.stillInFacility = true;
    }

    public Dog() {
        this.name = "Max";
        this.ownerName = "Bill";
        this.age = 1;
        this.dogId = 000;
        this.dogChar = generateDogChar();
        this.dogTag = generateDogTag();
        this.stillInFacility = true;
    }

    public String getName() {
        return name;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public int getAge() {
        return age;
    }
    public int getDogId() {
        return dogId;
    }
    public char getDogChar() {
        return dogChar;
    }
    public String getDogTag() {
        return dogTag;
    }
    public boolean isStillInFacility() {
        return stillInFacility;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDogId(int dogId) {
        this.dogId = dogId;
    }
    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }
    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }
    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String toString() {
        return (name + " is a(n) " + age + " year old dog, and their owner is "
            + ownerName + ". Their 3 digit dog ID is " + dogId + ", their dog character is "
            + dogChar + ", and their dog tag says " + dogTag + ". Currently, it is " + stillInFacility
            + " that they are in the facility.");
    }

    public boolean equals(Dog other) {
        return (this.name.equals(other.name) && this.ownerName.equals(other.ownerName)
            && this.age == other.age && this.dogId == other.dogId && this.dogChar == other.dogChar
            && this.dogTag.equals(other.dogTag) && this.stillInFacility == other.stillInFacility);
    }

    public String generateDogTag() {
        return "" + dogId + dogChar;
    }

    public generateDogChar() {
        int sunOfDigits = dogId % 10 + (dogId % 100) / 10 + (dogId / 100);

        
    }
    
}
