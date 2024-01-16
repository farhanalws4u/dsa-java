package Array;

public class Left_rotate_by_one {

    public static void rotate(int arr[]) { // T.C O(n) S.C O(1)
        int firstElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];

        }
        arr[arr.length - 1] = firstElement;

        System.out.println("array after rotate");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, };
        rotate(arr);
    }

}