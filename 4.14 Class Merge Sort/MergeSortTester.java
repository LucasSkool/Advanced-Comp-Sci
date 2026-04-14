public class MergeSortTester {
    public static void main(String[] args) {
        int[] array1 = {7, 8, 9, 11, 12};
        int[] array2 = {3, 5, 6, 10, 11, 13, 15};
        //int[] array3 = {1, 4, 6, 9, 12, 17, 30, 31, 44};

        System.out.println("Array 1: " + print(array1));
        System.out.println("Array 2: " + print(array2));
        System.out.println("Array 1 + 2: " + print(MergeSort.mergeSort(array1, array2)));
    }


    public static String print(int[] a) {
        String result = "{";
        for (int i = 0; i < a.length; i++) {
            result += a[i] + ", ";
        }
        result = result.substring(0, result.length() - 2);
        return result;
    }
}
