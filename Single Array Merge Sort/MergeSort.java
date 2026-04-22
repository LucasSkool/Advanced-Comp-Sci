public class MergeSort {
    public static void main (String[] args) {
        int[] testArr = {63, 42, 35, 74, 52};
        System.out.println(toString(testArr));
        MergeSortRecursive.sort(testArr);
        System.out.println(toString(testArr));


    }

    public static String toString(int[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + " ";
        }
        return result;
    }

}