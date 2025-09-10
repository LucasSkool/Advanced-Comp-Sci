public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5, 4);

        System.out.println(rect1.toString());
        System.out.println(rect2.toString());

        rect1.setLength(1);
        rect1.setWidth(2);

        rect2.setLength(6);
        rect2.setWidth(7);

        System.out.println(rect1.toString());
        System.out.println(rect2.toString());

        System.out.println("It is " + rect1.equals(rect2) + " that rect1 and rect2 are equal");

        System.out.println(rect1.getDiagonal());
        System.out.println(rect2.getDiagonal());
    
    }
}
