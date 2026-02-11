public class Rectangle extends Polygon {
    double length;
    double width;

    public Rectangle(double width, double length) {
        super(4);
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        super(4);
        this.length = 4;
        this.width = 3;
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return super.toString() + "\nThis is a rectangle that has length "
            + length + " and width " + width + ".";
    }
}
