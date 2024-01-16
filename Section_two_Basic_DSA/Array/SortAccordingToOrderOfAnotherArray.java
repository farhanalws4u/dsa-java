import java.util.*;

class sortAccordingToOrderOfAnotherArray {

    static void sortAccording(int[] arr, int[] order) {
        int temp[] = new int[arr.length];
        int resIndex = 0;
        int visited[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
            visited[i] = 0;
        }

        Arrays.sort(temp);

        for (int j = 0; j < order.length; j++) {
            int foundIndex = binarySearch(temp, order[j]);
            for (int k = foundIndex; k < temp.length && (temp[k] == order[j]); k++) {
                arr[resIndex++] = temp[k];
                visited[k] = 1;
            }
        }

        for (int l = 0; l < arr.length; l++) {
            if (visited[l] == 0) {
                arr[resIndex++] = temp[l];
            }
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr1[] = { 1, 2, 3, 4, 3, 2, 4, 2, 5 };
        int arr2[] = { 4, 2, 1, 3 };

        sortAccording(arr1, arr2);

        System.out.println("Array after sorting: ");
        for (int ele : arr1) {
            System.out.println(ele);
        }
    }
}