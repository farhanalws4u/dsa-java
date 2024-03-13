public class insertionSort {

    static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 1, 0, 6, 5, 3, 4 };
        sort(arr);
        for (int e : arr)
            System.out.print(" " + e);
    }
}
