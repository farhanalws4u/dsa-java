
import java.util.*;

public class FindSymmetricParis {
    static void findPairs(int[][] arr) {
        int row = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < row; i++) {
            map.put(arr[i][0], arr[i][1]);
        }

        map.forEach((k, v) -> {
            if (map.get(v) == k) {
                System.out.println("Symmetry of " + "{" + k + "," + v + "}" + " is " + "{" + v + "," + k + "}");
            }
        });

    }

    public static void main(String[] args) {
        int[][] arr = { { 10, 20 }, { 30, 40 }, { 50, 60 }, { 20, 10 }, { 40, 30 } };
        findPairs(arr);
    }
}
