package Array_Advanced;

public class SortWithElementZeroOneTwo {

    static void sortNaive(int[] arr) {

    }

    public static void main(String args[]) {
        int arr[] = new int[] { 1, 0, 2, 1, 0 };
        sortNaive(arr);
        for (int ele : arr) {
            System.out.print(ele + "\t");
        }
    }
}
