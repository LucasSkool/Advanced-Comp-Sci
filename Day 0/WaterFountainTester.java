public class WaterFountainTester {
    public static void main(String[] args) {
    System.out.println("Hello");

    WaterFountain churchWaterFountain = new WaterFountain();
    WaterFountain libraryWaterFountain = new WaterFountain();
    libraryWaterFountain.sprayWater();
    libraryWaterFountain.dropWater();
    libraryWaterFountain.increaseMeter();
    System.out.println("Meter: " + libraryWaterFountain.meter);

    System.out.println(libraryWaterFountain.toString());
    libraryWaterFountain.pressButton();
    libraryWaterFountain.sprayWater();
    libraryWaterFountain.deactivateSensor();
    System.out.println(libraryWaterFountain.toString());
    
    System.out.println("Is the water fountain in the library equal to the one near the chrch?: " + libraryWaterFountain.equals(churchWaterFountain));

    }
}

