public class Unit4ExercisesTester {
    public static void main (String[] args) {
        
        //all of these tests are just copies of the example ones in the instruction page except the last one in fizzBuzz
        
        System.out.println();
        System.out.println("\n----------------- METHOD 1 TESTS -----------------\n");
        int[] nums = new int[] {5, 6, 45, 99, 13, 5, 6};
        System.out.println("Array:" + toString(nums));
        System.out.println("Matching End Sequence for n = 1? : " + Unit4Exercises.matchingEndSequences(nums, 1));

        System.out.println("Matching End Sequence for n = 2? : " + Unit4Exercises.matchingEndSequences(nums, 2));

        System.out.println("Matching End Sequence for n = 3? : " + Unit4Exercises.matchingEndSequences(nums, 3));

        System.out.println("\n\n----------------- METHOD 2 TESTS -----------------\n");

        int[] nums2 = new int[] {2, 1, 3, 5};
        System.out.println("Array:" + toString(nums2));
        System.out.println("3 Consecutive? : " + Unit4Exercises.hasThreeConsecutive(nums2));

        int[] nums3 = new int[] {2, 1, 2, 5};
        System.out.println("Array:" + toString(nums3));
        System.out.println("3 Consecutive? : " + Unit4Exercises.hasThreeConsecutive(nums3));

        int[] nums4 = new int[] {2, 4, 2, 5};
        System.out.println("Array:" + toString(nums4));
        System.out.println("3 Consecutive? : " + Unit4Exercises.hasThreeConsecutive(nums4));

        System.out.println("\n\n----------------- METHOD 3 TESTS -----------------\n");

        System.out.println("Num Seq. (5, 10) : " + toString(Unit4Exercises.generateNumberSequence(5, 10)));

        System.out.println("Num Seq. (11, 18) : " + toString(Unit4Exercises.generateNumberSequence(11, 18)));

        System.out.println("Num Seq. (1, 3) : " + toString(Unit4Exercises.generateNumberSequence(1, 3)));

        System.out.println("\n\n----------------- METHOD 4 TESTS -----------------\n");

        System.out.println("FizzBuzz. (1, 6) : " + toString(Unit4Exercises.fizzBuzz(1, 6)));

        System.out.println("FizzBuzz. (1, 8) : " + toString(Unit4Exercises.fizzBuzz(1, 8)));

        System.out.println("FizzBuzz. (1, 16) : " + toString(Unit4Exercises.fizzBuzz(1, 16)));
        //not exactly same as instruction examples to get "FizzBuzz" (11 --> 16)

        System.out.println("\n\n----------------- METHOD 5 TESTS -----------------\n");
        
        int[] nums5 = new int[] {1, 0, 1, 0, 0, 3, 1};
        System.out.println("Array:" + toString(nums5));
        System.out.println("3 Consecutive? : " + toString(Unit4Exercises.moveEvenBeforeOdd(nums5)));

        int[] nums6 = new int[] {3, 3, 2};
        System.out.println("Array:" + toString(nums6));
        System.out.println("3 Consecutive? : " + toString(Unit4Exercises.moveEvenBeforeOdd(nums6)));

        int[] nums7 = new int[] {2, 2, 2};
        System.out.println("Array:" + toString(nums7));
        System.out.println("3 Consecutive? : " + toString(Unit4Exercises.moveEvenBeforeOdd(nums7)));

        
    }

    //i coded these for my tester
    //i feel like usually they don't have parameters but i think i forgot how to do that so whatever they work anyways
    public static String toString(int[] nums) {
        String result = "[";
        for (int i = 0; i < nums.length; i++) {
            result += nums[i] + ", ";
        }
        result = result.substring(0, result.length() - 2) + "]";
        return result;
    }

    public static String toString(String[] strings) {
        String result = "[";
        for (int i = 0; i < strings.length; i++) {
            result += strings[i] + ", ";
        }
        result = result.substring(0, result.length() - 2) + "]";
        return result;
    }

}
