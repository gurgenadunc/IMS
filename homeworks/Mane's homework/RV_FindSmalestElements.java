public class RV_FindSmalestElements {
    public static void main(String[] args) {
        int[] array = {12, 13, 1, 10, 34, 1};
        int min1 = 0;
        int min2 = 0;

        if (array[0]<array[1]) {
            min1 = array[0];
            min2 = array[1];
        }else {
            min2 = array[0];
            min1 = array[1];
        }

        for (int i=2; i<array.length; i++) {
            if (array[i]<=min1) {
                min1 = array[i];
            }else if (array[i]<min2) {
                min2 = array[i];
            }
        }
        System.out.println(min1);
        System.out.println(min2);
    }
}

