package Array;

public class Remove_duplicates_sortedArray {

    public static void removeDuplicatesNaive(int arr[], int newArray[]) { // runs in O(n) and space O(n)

        newArray[0] = arr[0];
        int index = 1;

        for (int i = 1; i < arr.length; i++) {

            if (newArray[index - 1] != arr[i]) {
                newArray[index] = arr[i];
                index++;
            } else
                continue;
        }
    }

    public static int removeDuplicatesEfficient(int arr[]) {
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 3, 3, 3, 4, 5, 6, 6, 6 };
        int newArray[] = new int[arr.length];

        // removeDuplicatesNaive(arr, newArray);
        int newSize = removeDuplicatesEfficient(arr);

        for (int i = 0; i < newSize; i++) {
            System.out.println(arr[i]);
        }
    }
}
