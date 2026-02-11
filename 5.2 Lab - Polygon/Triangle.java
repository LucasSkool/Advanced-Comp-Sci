public class Triangle extends Polygon {
    double base;
    double height;

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public Triangle() {
        super(3);
        this.base = 3;
        this.height = 4;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public String toString() {
        return super.toString() + "\nThis is a triangle with base length "
            + base + " and height " + height + ".";
    }
}
