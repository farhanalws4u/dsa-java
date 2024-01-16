
import java.util.*;

public class FrequencyOfElements {
    static void findFrequency(int[] arr) {
        int size = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            if (map.containsKey(arr[i])) {
                int val = map.get(arr[i]);
                map.put(arr[i], val + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("key " + entry.getKey() + " value " + entry.getValue());
        }
    }

    public static void main(String arg[]) {
        int arr[] = { 1, 1, 2, 3, 3, 4, 5 };
        findFrequency(arr);
    }
}
