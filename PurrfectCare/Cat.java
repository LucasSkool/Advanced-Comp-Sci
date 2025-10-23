public class Cat {
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;

    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catId = PurrfectUtils.validateCatId(catId);
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;
    }

    public Cat () {
        this.name = "Doggy";
        this.ownerName = "Bill";
        this.moodLevel = 5;
        this.catId = "1000";
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
        this.isHungry = true;
    }

    // CMD + SHIFT + P --> "source action" --> getters & setters --> generate all

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public String getCatId() {
        return catId;
    }

    public char getCatChar() {
        return catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
    }

    public void setCatId(String catId) {
        this.catId = PurrfectUtils.validateCatId(catId);
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }
    
    public String generateCatTag() {
        return this.catId + this.catChar; // hopefully char isn't converted to an int for some reason
    }

    public String toString() {
        String result = "";
        result += "== ABOUT " + this.name + " ==\n";
        result += this.name + " is a cat.\n";
        result += "Their tag is " + this.generateCatTag() + ".\n"; // I'm not sure if this actually works
        result += PurrfectUtils.determineCatMood(this);
        return result;
    }

    public boolean equals(Cat other) {
        if ((this.name).equals(other.getName())
            && this.ownerName.equals(other.getOwnerName())
            && this.moodLevel == other.getMoodLevel()
            && (this.generateCatTag()).equals(other.generateCatTag())
            && this.isHungry == other.isHungry()) {
            
            return true;
        }
        return false;
    }
    
}
