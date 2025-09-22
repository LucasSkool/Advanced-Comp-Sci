public class Line {
    private int a;
    private int b;
    private int c;

    Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double calculateSlope() {
        return ((double) -a) / ((double) b);
    }

    public boolean isCoordinateOnLine(int x, int y) {
        return ((a * x + b * y + c == 0));
    }

    public String toString() {
        return ("Equation: " + a + "x " + "+ " + b + "y " + "+ " + c + " = 0");
    }

    public boolean equals(Line other) {
        return (this.a == other.getA() && this.b == other.getB() && this.c == other.getC());
    }

}
