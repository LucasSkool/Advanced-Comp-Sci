public class Rectangle {
    private int length;
    private int width;

    public Rectangle(){ //must match name of the class
        length = 2;
        width = 1;
    }

    public Rectangle(int inputLength, int inputWidth){
        this.length = inputLength;
        this.width = inputWidth;
    }
    public Rectangle(int squareSideLength){
        this.length = squareSideLength;
        this.width = squareSideLength;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public void setLength(int newLength) {
        this.length = newLength;
    }
    public void sedWidth(int newWidth) {
        this.width = newWidth;
    }

    public int calculateArea() {
        return length*width;
    }
    public int calculatePerimeter() {
        return (2*length) + (2*width);
    }
    public double calculateDiagnol() {
        return Math.sqrt((double)length*length + width*width);
    }


}
