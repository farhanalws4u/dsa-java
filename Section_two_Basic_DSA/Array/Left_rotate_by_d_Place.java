package Array;

public class Left_rotate_by_d_Place {

    public static void rotateD(int arr[], int d) { // also called block swap algorithm.
        // this solution works on O(n) time and O(d) auxiliary space.

        if (d == arr.length) {
            System.out.println("array length and rotate value is same. you will get the same array after rotation.");
            return;
        }
        if (d > arr.length) {
            System.out.println("rotate value should be less than array length.");
            return;
        }

        int len = arr.length;
        int temp[] = new int[d]; // for storing elements which are one index less than d.

        for (int i = 0; i < len; i++) {

            if (i < d) {
                temp[i] = arr[i];
            } else {
                arr[i - d] = arr[i];
            }
        }

        // this loop for shifting the elements of temp or the elements which are at
        // index less than d. because if we shift them initially, they will get replaced
        // at some last index elements and those elements would lost their value.

        for (int i = 0; i < d; i++) {
            arr[len - d + i] = temp[i];
        }

        for (int i : arr) { // printing array after rotation.
            System.out.println(i);
        }

    }

    public static void rotateSpaceEfficient(int arr[], int d) {
        // this solution doesn't take extra d space. works in O(1) auxiliary space.
        // this solution works by reversing the array in parts. then reverse the
        // complete array to get the rotated array.

        int len = arr.length;

        reverse(arr, 0, d - 1);
        reverse(arr, d, len - 1);
        reverse(arr, 0, len - 1);

        for (int i : arr) { // printing array after rotation.
            System.out.println(i);
        }

    }

    static void reverse(int arr[], int low, int high) {
        while (low < high) {

            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, };
        int d = 3;
        rotateSpaceEfficient(arr, d);
        // rotateD(arr, d);
    }
}
