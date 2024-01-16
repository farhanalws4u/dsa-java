package Recursion;

import java.util.*;

public class LargestElementOfArray {

    static int findLargest(int[] arr, int size, int i, int max) {
        if (i == size)
            return max;

        if (arr[i] > max)
            max = arr[i];

        return findLargest(arr, size, i + 1, max);
    }

    static int findSmallest(int[] arr, int size, int i, int min) {
        if (i == size)
            return min;

        if (arr[i] < min)
            min = arr[i];

        return findSmallest(arr, size, i + 1, min);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 3, 1, 5, 4, 9, 0 };
        System.out.println("Largest => " + findLargest(arr, arr.length, 1, arr[0]));
        System.out.println("Smallest => " + findSmallest(arr, arr.length, 1, arr[0]));
        sc.close();
    }
}
