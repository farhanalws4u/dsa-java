package love_babbar_dsa_sheet.Arrays;

import java.util.ArrayList;

public class ReverseAfterPosition {

    public static void reverseArray(ArrayList<Integer> arr, int m) {

        int left = m + 1;
        int right = arr.size() - 1;

        while (left < right) {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left++;
            right--;
        }
        arr.forEach(e -> System.out.print(e + " "));
    }

    static void reverseNormal(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); // 1 2 3 4 5 6
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        int narr[] = { 1, 2, 3, 4, 5, 6 };
        // reverseNormal(narr);
        reverseArray(arr, 3);

    }
}
