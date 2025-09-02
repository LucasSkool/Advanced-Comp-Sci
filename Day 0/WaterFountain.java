public class WaterFountain {

    public double meter; // = 30965.36;
    private int numButtons; // = 3;
    private boolean buttonPressed;
    private boolean sensorActivated; // = false;
    private String frame; // = "rectangular";
    private String colors; // = "grey and light blue";
    private char firstLetterOfObject; // = 'W';

    public WaterFountain() {
        meter = 30965.36;
        numButtons = 3;
        buttonPressed = false;
        sensorActivated = false;
        frame = "rectangular";
        colors = "grey and light blue";
        firstLetterOfObject = 'W';
    }

    public void sprayWater() {
        if(buttonPressed = true) {
            System.out.println("Water Sprayed");
        }
        meter = meter + 0.1;
    }
    public void pressButton() {
        buttonPressed = true;
    }
    public void unpressButton() {
        buttonPressed = false;
    }
    public void activateSensor() {
        sensorActivated = true;
    }
    public void deactivateSensor() {
        sensorActivated = false;
    }
    public void dropWater() {
        if(sensorActivated)
        {
            System.out.println("Water dropped");
        }
        meter++;
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


    // Shoot water
    // drop water
    // meter increase
    // humm

}