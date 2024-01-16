<<<<<<< HEAD
package Section_two_Basic_DSA.Array;

public class Check_sorted {

    public static boolean checkSortedNaive(int arr[]) {

        for (int i = 0; i < arr.length; i++) { // runs in O(n^2)
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;

    }

    public static boolean checkSortedEfficient(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) { // runs in O(n)
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 50, 900, 300 };
        // boolean bool = checkSortedNaive(arr);
        boolean bool = checkSortedEfficient(arr);

        if (bool)
            System.out.println("array is sorted.");
        else
            System.out.println("array is not sorted.");

    }
}
=======
package Section_two_Basic_DSA.Array;

public class Check_sorted {

    public static boolean checkSortedNaive(int arr[]) {

        for (int i = 0; i < arr.length; i++) { // runs in O(n^2)
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;

    }

    public static boolean checkSortedEfficient(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) { // runs in O(n)
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 50, 900, 300 };
        // boolean bool = checkSortedNaive(arr);
        boolean bool = checkSortedEfficient(arr);

        if (bool)
            System.out.println("array is sorted.");
        else
            System.out.println("array is not sorted.");

    }
}
>>>>>>> b8104b6 (done with some new problem on array)
