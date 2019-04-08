public class RV_DoubleArrayDisplay {
    public static void main(String[] args) {
        int [][] array ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i=0; i<array.length;i++) {
            for (int j=0; j<i; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }


    }
}
