public class WaterFountain {

    private double meter; // = 30965.36;
    private int numButtons; // = 3;
    private boolean hasSensor; // = true;
    private String frame; // = "rectangular";
    private String colors; // = "grey and light blue";
    private char firstLetterOfObject; // = 'W';

    public WaterFountain() {
        meter = 30965.36;
        numButtons = 3;
        hasSensor = true;
        frame = "rectangular";
        colors = "grey and light blue";
        firstLetterOfObject = 'W';
    }

    public void sprayWater() {
        System.out.println("Water Sprayed");
    }

    public void dropWater() {
        System.out.println("Water dropped");
    }

    public void increaseMeter() {
        meter++;
    }

    public void humm() {
        System.out.println("hummmmmmmmm");
    }

    public void destroy() {
        frame = "circle";
    }

    public double getMeter(){
        return meter;
    }

    public void filter(){
        colors = "green";
    }

    // Shoot water
    // drop water
    // meter increase
    // humm

}