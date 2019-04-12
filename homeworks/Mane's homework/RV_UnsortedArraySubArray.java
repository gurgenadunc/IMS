import java.util.Arrays;

public class RV_UnsortedArraySubArray {
    public static void main(String[] args) {
        int[] array = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        int subArrayFirstIndex = 0;
        int subArrayLastIndex = 0;


        for(int j=0;j<array.length-1;j++){

            if(array[j]>array[j+1]){
                if (array[j+1]>array[j-1]) {
                    subArrayFirstIndex = j;
                    break;
                } else {
                    subArrayFirstIndex = j+1;
                }
            }
        }

        for (int k=array.length-1; k>0; k--) {
            if (array[k]<array[k-1]) {
                if (array[k-1]>array[k+1]) {
                    subArrayLastIndex = k + 1;
                    break;
                }else{
                    subArrayLastIndex = k;
                }
            }
        }

        int[] subArray = Arrays.copyOfRange(array, subArrayFirstIndex, subArrayLastIndex + 1);

        int max = subArray[0];
        for (int i=1; i<subArray.length; i++) {
            if (max<subArray[i]) {
                max=subArray[i];
            }
        }
        System.out.println(max);

        int min = subArray[0];
        for (int i=0; i<subArray.length; i++) {
            if (min>subArray[i]) {
                min=subArray[i];
            }
        }
        System.out.println(min);
//
//
//        for (int i=0; i<array.length; i--) {
//            if (min >array[i]) {
//                subArrayFirstIndex = i+1;
//                break;
//            }
//
//        }


        for (int i=array.length-1; i>0; i--) {
            if (max >array[i]) {
                subArrayLastIndex = i;
                break;
            }

        }



        System.out.println(subArrayFirstIndex);
        System.out.println(subArrayLastIndex);
    }
}
