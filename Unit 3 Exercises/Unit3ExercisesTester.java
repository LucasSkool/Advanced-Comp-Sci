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

        System.out.println("-----------Task6-----------");
        testExample15();
        System.out.println();
        try {
            testExample16();
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-----------Task7-----------");
        testExample17();
        System.out.println();
        try {
            testExample18();
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-----------Task8-----------");
        testExample19();
        try {
            testExample20();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        testExample21();

        System.out.println("-----------Task9-----------");
        testExample22();

        try {
            testExample23();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-----------Task10-----------");
        testExample24();
        System.out.println();

        try {
            testExample25();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        
        try {
            testExample26();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        
        try {
            testExample27();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
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


    //task 6

    public static void testExample15() {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Unit3Exercises.calculateSumOfSquares(nums));
    }

    public static void testExample16() {
        int[] nums = null;
        System.out.println(Unit3Exercises.calculateSumOfSquares(nums));
    }

    //task 7
    public static void testExample17() {
        System.out.println(Unit3Exercises.getNthFibonacci(4));
        //not sure the definition of "Nth"
    }

    public static void testExample18() {
        System.out.println(Unit3Exercises.getNthFibonacci(-1));
    }

    //task 8
    public static void testExample19() {
        int[] arr = {3, 9, 4, 5, 10};
        Unit3Exercises.sortArrayDecending(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ", ");
        }
    }

    public static void testExample21() {
        int[] arr = {3, -9, 4, 5, -10};
        Unit3Exercises.sortArrayDecending(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void testExample20() {
        int[] arr = null;
        Unit3Exercises.sortArrayDecending(arr);
        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        } */
        //got rid of this because it made a yellow squiggly
        System.out.println();
    }


    //task 9
    public static void testExample22() {
        System.out.println(Unit3Exercises.findLongestWord("I do not have a cat"));
    }

    public static void testExample23() {
        System.out.println(Unit3Exercises.findLongestWord(null));
    }

    //task 10
    public static void testExample24() {
        System.out.println(Unit3Exercises.calculateInterest(10000, 3.5, 5));
    }
    
    public static void testExample25() {
        System.out.println(Unit3Exercises.calculateInterest(-10000, 3.5, 5));
    }

    public static void testExample26() {
        System.out.println(Unit3Exercises.calculateInterest(10000, -3.5, 5));
    }

    public static void testExample27() {
        System.out.println(Unit3Exercises.calculateInterest(10000, 3.5, -5));
    }
}