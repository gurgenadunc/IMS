import java.util.Arrays;

public class RV_MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] array01 = {1,2,7,8};
        int[] array02 = {2,5,6,7,9,10};

        int[] array = new int[array01.length + array02.length];
        int i=0, j=0, k=0;
        while (i < array01.length && j < array01.length) {
            if (array01[i] < array02[j]) {
                array[k++] = array01[i++];
            } else {
                array[k++] = array02[j++];
            }
        }

        while (i < array01.length) {
              array[k++] = array01[i++];
        }
        while (j < array02.length){
              array[k++] = array02[j++];
        }
        
        System.out.println(Arrays.toString(array));
    }
}

