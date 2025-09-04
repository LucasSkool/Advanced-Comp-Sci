public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5, 4);
        Rectangle rect3 = new Rectangle(6, 7);

        System.out.println(rect1.calculatePerimeter());
        System.out.println(rect2.calculateArea());
        System.out.println(rect3.calculateDiagnol());

    }
}
