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

    public String toString() {
        return "This waterfountain that starts with a " + firstLetterOfObject + 
        " has a " + frame + " frame, " + colors + " colors, has " + numButtons + " buttons, and the current meter reading is " 
        + meter + ". Currently, it is " + buttonPressed + " that one of the buttons are being pressed, and "
        + sensorActivated + " that the sensor is activated.";
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

    public double getMeter() {
        return meter;
    }
    public void setMeter(double newMeter) {
        this.meter = newMeter;
    }
    public int getNumButtons() {
        return this.numButtons;
    }
    public void setNumButtons(int newNumButtons) {
        this.numButtons = newNumButtons;
    }
    public boolean getButtonPressed() {
        return buttonPressed;
    }
    public void setButtonPressed(boolean buttonPressed) {
        this.buttonPressed = buttonPressed;
    }
    public boolean getSensorActivated() {
        return sensorActivated;
    }
    public void setSensorActivated(boolean sensorActivated) {
        this.sensorActivated = sensorActivated;
    }
    public String getFrame() {
        return frame;
    }
    public void setFrame(String newFrame) {
        this.frame = newFrame;
    }
    public String getColors() {
        return colors;
    }
    public void setColors(String newColors) {
        this.colors = newColors;
    }
    public char getFirstLetterOfObject() {
        return firstLetterOfObject;
    }
    public void setFirstLetterOfObject(char newLetter) {
        this.firstLetterOfObject = newLetter;
    }


    public boolean equals(WaterFountain otherWaterFountain) {
        if(this.meter == otherWaterFountain.meter
        && this.numButtons == otherWaterFountain.numButtons
        && this.buttonPressed == otherWaterFountain.buttonPressed
        && this.sensorActivated == otherWaterFountain.sensorActivated
        && this.frame.equals(otherWaterFountain.frame)
        && this.colors.equals(otherWaterFountain.colors)
        && this.firstLetterOfObject == otherWaterFountain.firstLetterOfObject
        ) {
            return true;
        }
        return false;
    }

}