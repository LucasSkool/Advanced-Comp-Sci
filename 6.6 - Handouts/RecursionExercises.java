public class RecursionExercises {

    /**
     * Returns n!
     */
    public static int factorial(int n) {
        return 0;
    }

    /**
     * Returns the nth number in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        return 0;
    }

    /**
     * Returns the sum of the digits of a given integer.
     */
    public static int sumDigits(int n) {
        return 0;
    }

    /**
     * Returns the count of occurrences of 'x' in a given string.
     */
    public static int countX(String str) {
        return 0;
    }

    /**
     * Returns the reverse of a given string.
     */
    public static String reverseString(String str) {
        return "";
    }

    /**
     * Returns the value of base raised to the power of exponent.
     */
    public static int power(int base, int exponent) {
        return 0;
    }

    /**
     * Returns whether a given string is a palindrome.
     */
    public static boolean isPalindrome(String str) {

        return false;
    }

    /**
     * Returns how many paths a fancy rat could take from (startRow, startColumn) to
     * (endRow, endColumn)
     * if it could only move right or down
     */
    public static int howManyPaths(int startRow, int startColumn, int endRow, int endColumn) {
        return 0;
    }

    /**
     * DO NOT EDIT! Write the recursive helper method below instead.
     */
    public static int binarySearch(int[] arr, int key) {
        return binarySearchRecursiveHelper(arr, key, 0, arr.length - 1);
    }

    /**
     * Implements the binary search algorithm to find and return the index of a
     * given element in a sorted array if it is between low and high, or -1 if it is
     * not found between low and high.
     */
    public static int binarySearchRecursiveHelper(int[] arr, int key, int low, int high) {
        return -1; // Element not found
    }

    /**
     * Returns whether there exists a path from (startRow, startColumn) to
     * (endRow, endColumn) in the 2D rewards array
     * that never goes through the String "ratpoison"
     */
    public static boolean existsPath(String[][] rewards, int startRow, int startColumn,
            int endRow, int endColumn) {
        return false;
    }

}
