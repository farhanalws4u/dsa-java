package love_babbar_dsa_sheet.Arrays;

public class MoveNegativeToStart {

    static void moveNegatives(int[] arr) {
        int len = arr.length;

        int low = 0;
        int high = len - 1;

        while (low < high) {
            if (arr[low] < 0)
                low++;
            if (arr[high] > 0)
                high--;

            if (arr[low] > 0 && arr[high] < 0) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        moveNegatives(arr);
    }
}
