public class LineTester {

    public static void main(String[] args) {

        Point p1 = new Point(2, 7);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(11, 18);
        Point p4 = new Point(4, 13);

        Line pointLine = new Line(p1, p2);

        System.out.println();
        System.out.println("Slope of pointLine using calculateSlope(): "
            + pointLine.calculateSlope());
        System.out.println("Slope of pointLine using calculateSlopeFromPoints(): "
            + pointLine.calculateSlopeFromPoints());
        if (pointLine.calculateSlope() == pointLine.calculateSlopeFromPoints()) {
            System.out.println("The slope formulas match.");
        } else {
            System.out.println("The slope formulas do not match.");
        }

        
        System.out.println();
        System.out.println("Is p1 on pointLine?: " + pointLine.isCoordinateOnLine(p1));
        System.out.println("Is p2 on pointLine?: " + pointLine.isCoordinateOnLine(p2));
        System.out.println("Is p3 on pointLine?: " + pointLine.isCoordinateOnLine(p3));
        System.out.println("Is p4 on pointLine?: " + pointLine.isCoordinateOnLine(p4));
        System.out.println();
    }
}
