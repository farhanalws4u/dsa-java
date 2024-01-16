public class BubbleSort {

    public static void sort(int arr[]) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String arg[]) {
        int arr[] = { 2, 1, 0, 4, 5, 10, 8 };

        System.out.println("Array before sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        sort(arr);
        System.out.println("Array after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}
