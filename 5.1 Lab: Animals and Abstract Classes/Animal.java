public abstract class Animal {
    // Panda tapir pisol-shrimp
    private String name;
    private boolean isHungry;
    private String habitat;

    public Animal (String name, boolean isHungry, String habitat) {
        this.name = name;
        this.isHungry = isHungry;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public abstract String makeNoise();
    
}
