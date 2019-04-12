public class RV_PrintMissingElements {
    public static void main(String[] args) {
        int[] array = {10, 12, 11, 15};
        int low = 10;
        int high = 15;
        for (int i=low; i<=high; i++) {
            for (int j=0; j<array.length; j++) {
                if (i==array[j]) {
                    break;
                }if (j==array.length-1) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
