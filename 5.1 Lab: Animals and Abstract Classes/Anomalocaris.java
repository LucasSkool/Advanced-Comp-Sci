public class Anomalocaris extends Animal {
    String species;
    String color;
    int age;

    public Anomalocaris() {
        super("bebe", false, "ocean");
        this.species = "ano malo caracas";
        this.color = "pink";
        this.age = 1;
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

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String makeNoise() {
        return "I try my best";
    }
}