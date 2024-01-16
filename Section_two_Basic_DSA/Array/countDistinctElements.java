
import java.util.*;

public class countDistinctElements {

    static void countElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], arr[i]);
        }

        System.out.println("Number of distinct elements are " + map.size());
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3, 4, 5 };
        countElements(arr);
    }
}
