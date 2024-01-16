import java.util.*;
import java.util.*;

public class ReplaceElementByRank {

    static void replace(int[] arr) {
        int len = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp[] = new int[len];

        for (int j = 0; j < len; j++) {
            temp[j] = arr[j];
        }

        Arrays.sort(temp);

        for (int i = 0; i < len; i++) {
            map.put(temp[i], i + 1);
        }

        for (int i = 0; i < len; i++) {
            int index = linearSearch(arr, temp[i]);
            arr[index] = map.get(temp[i]);
        }

        for (int ele : arr) {
            System.out.println(ele);
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 40, 10, 20, 30 };

        replace(arr);
    }
}
