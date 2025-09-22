public class LineTester {

    public static void main(String[] args) {

        // Testing Line 1
        Line line1 = new Line(5, 4, -17);
        System.out.println(line1.toString());
        double slope1 = line1.calculateSlope(); // slope1 should be -1.25
        System.out.println("Slope: " + slope1);
        // Should be true, as 5(5) + 4(-2) + (-17) = 0
        boolean onLine1 = line1.isCoordinateOnLine(5, -2); 
        System.out.println("On Line?: " + onLine1);

        // Testing Line 2
        Line line2 = new Line(-25, 40, 30);
        System.out.println(line2.toString());
        double slope2 = line2.calculateSlope(); // slope2 should be 0.625
        System.out.println("Slope: " + slope2);

        // Should be false as -25(5) + 40(-2) + 30 != 0
        boolean onLine2 = line2.isCoordinateOnLine(5, -2); 
        System.out.println("On Line?: " + onLine2);


        // Testing Line 3
        Line line3 = new Line(8, 2, 10);
        System.out.println(line3.toString());
        double slope3 = line3.calculateSlope(); // slope2 should be -4.0
        System.out.println("Slope: " + slope3);

        // Should be true as 8(-2) + 2(3) + 10 = 0
        boolean onLine3 = line3.isCoordinateOnLine(-2, 3);
        System.out.println("On Line?: " + onLine3);

        //
        //Okay I'm fairly sure it works






    }
}
