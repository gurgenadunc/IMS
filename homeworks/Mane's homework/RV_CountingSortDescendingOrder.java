import java.util.Arrays;

public class RV_CountingSortDescendingOrder {
    public static void main(String[] args) {
        int[] mainArray = {3,0,2,1,1};

        int max=mainArray[0];
//finds maximum

        for (int i=1; i<mainArray.length; i++) {
            if (max<mainArray[i]) {
                max=mainArray[i];
            }
        }

        System.out.println(max);
//found maximum


        int[] array02 = new int[max+1];

        for (int i=0; i<array02.length; i++) {

            int count=0;

            for (int j=0; j<mainArray.length; j++) {
                if (i==mainArray[j]) {
                    count++;
                }
            }

            array02[i] = count;

        }

        System.out.println(Arrays.toString(array02));
        int j=0;

        for (int i=array02.length-1; i>0; i--) {
            while (array02[i]>0) {
                mainArray[j++]=i;
                array02[i]--;
            }
        }

        System.out.println(Arrays.toString(mainArray));

    }
}
