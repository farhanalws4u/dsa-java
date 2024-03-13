package love_babbar_dsa_sheet.Arrays;

public class SortArrayOfZerosOnesAndTwos { // also called dutch national flag problem.

    static void sortColors(int[] nums) { // the problem can also be done using the counting approach
        int low = 0;
        int high = nums.length - 1;

        for (int i = 0; i < nums.length && i <= high;) {

            if (nums[i] == 0) {
                swap(nums, low, i);
                low++;
                i++;
            }

            else if (nums[i] == 2) {
                swap(nums, i, high);
                high--;
            }
            // Current element is 1
            else {
                i++;
            }
        }
        System.out.println("Array After sorting:");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 2, 0, 1 };
        sortColors(arr);
    }
}
