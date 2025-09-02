public class WaterFountainTester {
    public static void main(String[] args) {
    System.out.println("Hello");

    WaterFountain libraryWaterFountain = new WaterFountain();
    libraryWaterFountain.sprayWater();
    libraryWaterFountain.dropWater();
    libraryWaterFountain.increaseMeter();
    System.out.println("Meter: " + libraryWaterFountain.meter);


    }
}

