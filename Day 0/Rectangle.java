public class Rectangle {
    private int length;
    private int width;

    public String toString() {
        return "Rectangle: " + length + " x " + width;
    }

    public Rectangle() {
        length = 2;
        width = 1;
    }

    public Rectangle(int newLength, int newWidth) {
        this.length = newLength;
        this.width = newWidth;
    }

    public Rectangle(int squareSideLength) {
        this.length = squareSideLength;
        this.width = squareSideLength;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int newLength) {
        this.length = newLength;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public boolean equals(Rectangle other) {
        if (this.length == other.getLength() && this.width == other.getWidth()) {
            return true;
        }
        return false;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double getDiagonal() {
        return Math.sqrt((double) length * length + width * width);
    }


}
