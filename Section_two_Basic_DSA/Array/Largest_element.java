
package Section_two_Basic_DSA.Array;

import java.lang.*;

public class Largest_element {

    public static int largest(int arr[]) {

        int maxEle = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxEle)
                maxEle = arr[i];
        }
        return maxEle;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 350, 2, 56, 900, 3 };

        System.out.println("largest element is" + largest(arr));
    }
}
