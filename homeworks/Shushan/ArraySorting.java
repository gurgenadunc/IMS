import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        /** ascending order */
        int tver [] = {5, 1, 2, 6, 4, 2, 10};
        for (int i=0; i<tver.length; i++) {
            for (int j=0; j<tver.length-1-i; j++) {
                if (tver[j]>tver[j+1]) {
                    int temp = tver[j];
                    tver[j]=tver[j+1];
                    tver[j+1]=temp;
                }
            }
        }
        System.out.print("my array in ascending order: ");
        MyToString.myToString(tver);

        /** descending order */
        for (int i=0; i<tver.length; i++) {
            for (int j=tver.length - 2; j>=0 + i; j--) {
                if (tver[j]<tver[j+1]) {
                    int temp = tver[j];
                    tver[j]=tver[j+1];
                    tver[j+1]=temp;
                }
            }
        }
        System.out.print("my array in descending order: ");
        MyToString.myToString(tver);

        /** array counting sorting */
        countingSortAscending(tver, 10);
        System.out.print("my array sorted by counting algorithm in ascending order: ");
        MyToString.myToString(tver);

        countingSortDescending(tver, 10);
        System.out.print("my array sorted by counting algorithm in descending order: ");
        MyToString.myToString(tver);
    }

    public static void countingSortAscending(int[] input, int k) {
        int counter[] = new int[k + 1];
        for (int i : input) {
            counter[i]++;
        }
        int index = 0;
        for (int i = 0; i < counter.length; i++) {
            while (0 < counter[i]) {
                input[index++] = i;
                counter[i]--;
            }
        }
    }
    /** Descending order */
    public static void countingSortDescending(int[] input, int k) {
        int counter[] = new int[k + 1];
        for (int i : input) {
            counter[i]++;
        }
        int index = 0;
        for (int i = counter.length-1; i>0; i--) {
            while (0 < counter[i]) {
                input[index++] = i;
                counter[i]--;
            }
        }
    }
}