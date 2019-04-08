public class RV_ToStringMethod {
    public static void main(String[] args) {
        int[] array = {1, 8, 9, 8, 7};

        String string = "[";
        for (int k:array) {
            string+=k + ", ";
        }

        string = string.substring(0,string.length()-2) +"]";
        System.out.println(string);

    }
}
