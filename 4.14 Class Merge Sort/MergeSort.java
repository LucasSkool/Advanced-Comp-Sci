public class MergeSort {
    
    public static int[] mergeSort(int[] a, int[] b) {
        int aIndex = 0;
        int bIndex = 0;
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length + b.length; i++) {
            if (bIndex >= b.length) {
                result[i] = a[aIndex];
                aIndex++;
            } else if (aIndex >= a.length) {
                result[i] = b[bIndex];
                bIndex ++;
            } else if (a[aIndex] <= b[bIndex]) {
                result[i] = a[aIndex];
                aIndex++;
            } else {
                result[i] = b[bIndex];
                bIndex++;
            }
        }

        return result;
    }

}