public class PistolShrimp extends Animal {
    
    String species;
    String color;
    int age;
    double snapStrength; //will be in dB
    boolean isThreatened;

    public PistolShrimp() {
        super("Shrimp 1", false, "ocean");
        this.species = "Alpheus bellulus";
        this.color = "white";
        this.age = 0;
        this.snapStrength = 1;
        this.isThreatened = false;

    }

    public PistolShrimp(String species, String color, int age) {
        super("Shrimper", false, "ocean");
        this.species = species;
        this.color = color;
        this.age = age;
        this.snapStrength = 4;
        this.isThreatened = false;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public double getSnapStrength() {
        return snapStrength;
    }

    public boolean isThreatened() {
        return isThreatened;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSnapStrength(double snapStrength) {
        this.snapStrength = snapStrength;
    }

    public void setThreatened(boolean isThreatened) {
        this.isThreatened = isThreatened;
    }

    
    public String toString() {
        return super.getName() + "is of the " 
            + species + " species, is the color " 
            + color + ", are they hungry?: " 
            + super.isHungry() + ", is " 
            + age + " years old, has a snap strength rating of " 
            + snapStrength + ", and are they currently threatened? " 
            + isThreatened + ", it's habitat is "
            + super.getHabitat();
    }

    public void attack() {
        isThreatened = true;
        snapStrength += 0.1;
    }

    public String makeNoise() {
        return "SNAP";
    }

    /*public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }*/

    
}
