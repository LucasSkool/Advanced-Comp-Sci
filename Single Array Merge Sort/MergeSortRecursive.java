public class MergeSortRecursive {

    public static void sort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) { //always inserts the same array but just with different scope
        if (left >= right) return; //base case (when focused arr portion is length 1), and also cannot have left be more right than the right

        int mid = left + (right - left) / 2; //calculating the midpoint of the array

        mergeSort(arr, temp, left, mid); //merge sorting each side
        mergeSort(arr, temp, mid + 1, right);

        merge(arr, temp, left, mid, right); //merging the sorted halves
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int leftPtr = left;      // pointer for left half
        int rightPtr = mid + 1;  // pointer for right half
        int writePtr = left;     // pointer for temp array

        // Step 1: Merge both halves while both have elements
        while (leftPtr <= mid && rightPtr <= right) {
            if (arr[leftPtr] <= arr[rightPtr]) {
                temp[writePtr] = arr[leftPtr];
                leftPtr++;
            } else {
                temp[writePtr] = arr[rightPtr];
                rightPtr++;
            }
            writePtr++;
        }

        // Step 2: Copy any remaining elements from left half
        while (leftPtr <= mid) {
            temp[writePtr] = arr[leftPtr];
            leftPtr++;
            writePtr++;
        }

        // Step 3: Copy any remaining elements from right half
        while (rightPtr <= right) {
            temp[writePtr] = arr[rightPtr];
            rightPtr++;
            writePtr++;
        }

        // Step 4: Copy merged result back into original array
        for (int i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }
}