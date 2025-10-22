public class TriangleLoopsTester {
    public static void main(String[] args) {
        // to-do: create a separate tester class
        // to-do: invoke each method at least 2 times in the tester class

        // for example:
        System.out.println("createLetterTriangleUp");
        System.out.println(TriangleLoops.createLetterTriangleUp(3, 'A'));
        System.out.println(TriangleLoops.createLetterTriangleUp(10, 'B'));
        System.out.println("");

        System.out.println("createLetterTriangleDown");
        System.out.println(TriangleLoops.createLetterTriangleUp(3, 'C'));
        System.out.println(TriangleLoops.createLetterTriangleUp(10, 'D'));
        System.out.println("");

        System.out.println("createNumbersTriangle");
        System.out.println(TriangleLoops.createNumbersTriangle(3));
        System.out.println(TriangleLoops.createNumbersTriangle(12));
        System.out.println("");
        
        System.out.println("createAlphabetTriangle");
        System.out.println(TriangleLoops.createAlphabetTriangle(4));
        System.out.println(TriangleLoops.createAlphabetTriangle(9));

    }
}
