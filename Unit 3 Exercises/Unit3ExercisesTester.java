public class Unit3ExercisesTester {
    public static void main(String[] args) {

        System.out.println("-----------Task1-----------");
        testExample1();
        System.out.println();
        testExample2();
        System.out.println();
        testExample2diff();
        System.out.println();

        System.out.println("-----------Task2-----------");
        testExample3();
        System.out.println();
        testExample4();
        System.out.println();

        System.out.println("-----------Task3-----------");
        testExample5();
        System.out.println();
        testExample6();
        System.out.println();
        testExample6diff();
        System.out.println();

        System.out.println("-----------Task4-----------");
        testExample7();
        System.out.println();
        testExample8();
        System.out.println();
        testExample9();
        System.out.println();

        System.out.println("-----------Task5-----------");
        testExample10();
        testExample11();
        testExample12();
        testExample13();
        testExample14();
   
    }

    public static void testExample1() {

        String[] names = {"lol", "lolol"};
        System.out.println(Unit3Exercises.calculateAverageStringLength(names));
        //should return 4.0
    }

    public static void testExample2() {

        String[] names = {};
        System.out.println(Unit3Exercises.calculateAverageStringLength(names));
        //should return 0
    }

    public static void testExample2diff() {
        String[] names = {"Lucas", null, "Lucas"};
        System.out.println(Unit3Exercises.calculateAverageStringLength(names));
        //expected 5.0
    }

    public static void testExample3() {
        String uhoh = null;
        System.out.println(Unit3Exercises.reverseString(uhoh));
    }

    public static void testExample4() {
        String name = "Luc @s";
        System.out.println(Unit3Exercises.reverseString(name));
    }

    public static void testExample5() {
        int[] array = {-1, 2, -5, 3};
        System.out.println(Unit3Exercises.findMaxValue(array));
    }

    public static void testExample6() {
        int[] array = null;
        System.out.println(Unit3Exercises.findMaxValue(array));
    }

    public static void testExample6diff() {
        int[] array = {};
        System.out.println(Unit3Exercises.findMaxValue(array));
    }

    public static void testExample7() {
        String name = "Lucas";
        System.out.println(Unit3Exercises.isPalindrome(name));
        //should print false;
    }

    public static void testExample8() {
        String palindrome = "rAceCar";
        System.out.println(Unit3Exercises.isPalindrome(palindrome));
        //should print true
    }

    public static void testExample9() {
        String anull = null;
        System.out.println(Unit3Exercises.isPalindrome(anull));
        //should print true
    }


    public static void testExample10() {
        int[] nums = {2, 2, 4, 5, 7};
        System.out.println(Unit3Exercises.sumEvenNumbers(nums));
    }

    public static void testExample11() {
        int[] nums = {3, 1, 5, 7};
        System.out.println(Unit3Exercises.sumEvenNumbers(nums));
    }

    public static void testExample12() {
        int[] nums = {2, 2, 4, 6};
        System.out.println(Unit3Exercises.sumEvenNumbers(nums));
    }

    public static void testExample13() {
        int[] nums = null;
        System.out.println(Unit3Exercises.sumEvenNumbers(nums));
    }

    public static void testExample14() {
        int[] nums = {};
        System.out.println(Unit3Exercises.sumEvenNumbers(nums));
    }
}