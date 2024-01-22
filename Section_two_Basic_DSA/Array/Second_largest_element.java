package Array;

public class Second_largest_element {

    public static int secondLargestEfficient(int arr[]) {
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                int temp = max;
                max = arr[i];
                secondMax = temp;
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 20, 19, 3, 6, 18, 17 };

        System.out.println("second largest using efficient " +
                secondLargestEfficient(arr));
    }
}
