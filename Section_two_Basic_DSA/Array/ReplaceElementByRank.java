package Array;

import java.util.*;
import java.util.*;

public class ReplaceElementByRank {

    static void replaceNew(int[] arr) {
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);

        for (int j = 0; j < arr.length; j++) {
            arr[j] = linearSearch(temp, arr[j]) + 1;
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

        replaceNew(arr);
    }
}
