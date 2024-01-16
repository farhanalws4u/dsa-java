package Section_two_Basic_DSA.Array;

public class Second_largest_element {

    public static int secondLargestNaive(int arr[]) { // it is done by two traversals of the array.
        int max = arr[0];
        int secondMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                if (arr[i] > secondMax)
                    secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static int secondLargestEfficient(int arr[]) {
        int max = arr[0];
        int secondMax = 0; // using only one traversal of the array.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                int temp = max;
                max = arr[i];
                secondMax = temp;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 20, 3, 6, 8 };
        System.out.println("second max number is " + secondLargestNaive(arr));
        // System.out.println("second largest using efficient " +
        // secondLargestEfficient(arr));
    }
}
