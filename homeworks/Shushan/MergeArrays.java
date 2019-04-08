import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 8, 10, 30, 43};
        int[] arr2 = {2, 6, 9, 15};
        merge(arr1, arr2);
    }
    public static void merge (int[] first, int[] second) {
        int[] mergedArray = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mergedArray[k++] = first[i++];
            } else {
                mergedArray[k++] = second[j++];
            }
        }
        while (i < first.length) mergedArray[k++] = first[i++];
        while (j < second.length) mergedArray[k++] = second[j++];
        System.out.print("Merged array is: ");
        System.out.println(Arrays.toString(mergedArray));
    }
}
