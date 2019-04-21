import java.util.Arrays;

public class RV_ReverseArrayRecursion {
    public static void main(String[] args) {

        int[] array = {9, 4, 5, 7, 2, 5, 8, 3, 1};
        System.out.println(Arrays.toString(reverseArray(array, 0, array.length - 1)));
    }

        public static int[] reverseArray ( int[] array, int i, int j){
            if (i == j) {
                return array;
            }

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            return reverseArray(array, i + 1, j - 1);

        }

}

