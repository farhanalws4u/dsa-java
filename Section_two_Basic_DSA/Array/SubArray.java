public class SubArray {

    static void generateNaive(int[] arr) {

        for (int start = 0; start < arr.length; start++) {

            for (int end = 0; end < arr.length; end++) {

                // for printing elements from start to end;
                System.out.print("[");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + ",");
                }
                System.out.print("]\n");

            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        generateNaive(arr);
    }
}
