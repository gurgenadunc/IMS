import java.util.Arrays;

public class RV_ReverseArray {
    public static void main(String[] args) {
        int[] array = {9,4,5,7,2,5,8,3,1};
        for (int i=0, j=array.length-1; i<=array.length/2-1; i++,j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
