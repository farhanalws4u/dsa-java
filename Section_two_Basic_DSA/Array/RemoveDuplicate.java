
import java.util.*;

public class RemoveDuplicate {
    static void remove(int[] arr) { // sort and new array.
        int last = arr[0];
        int res[] = new int[arr.length];
        int resIndex = 1;
        res[0] = arr[0];

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != last) {
                res[resIndex] = arr[i];
                resIndex++;
                last = arr[i];
            }
        }

        System.out.println("After removing the duplicate element from the array:");
        for (int num : res) {
            if (num != 0)
                System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 4, 4, 5, 6 };
        remove(arr);
    }
}
