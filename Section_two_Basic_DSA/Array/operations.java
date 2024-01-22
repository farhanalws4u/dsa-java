package Array;

import java.util.*;

public class operations {

    public static int insertion(int arr[], int size, int cap, int ele, int pos) {
        System.out.println("size and capicity received in insertion" + size + " " + cap);

        if (size == cap)
            return size;

        int idx = pos - 1;
        System.out.println("array of i+1" + arr[size]);

        for (int i = size - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }

        arr[idx] = ele;

        return size + 1;

    }

    public static void main(String[] args) {
        System.out.println("enter the size of the array.");
        Scanner in = new Scanner(System.in);
        int cap = in.nextInt();

        System.out.println("enter the number of elements you want to insert.");
        int size = in.nextInt();

        int arr[] = new int[size];

        System.out.println("enter the elements of array.");

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("the elements of array.");

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("enter the position to insert new element.");

        int pos = in.nextInt();

        System.out.println("enter the element you want to insert.");
        int ele = in.nextInt();

        int newSize = insertion(arr, size, cap, ele, pos);

        System.out.println("new size of array is " + newSize);

        System.out.println("array after insertion is :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }
}
