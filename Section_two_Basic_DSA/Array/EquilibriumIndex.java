public class EquilibriumIndex {

    static void findIndex(int[] arr, int mid, int left, int right) {

        int leftSum = 0;
        int rightSum = 0;

        for (int i = left; i < mid; i++) { // sum of left side subArray
            leftSum += arr[i];
        }

        for (int j = mid + 1; j < arr.length; j++) { // sum of right side subArray
            rightSum += arr[j];
        }

        if (rightSum == leftSum) {
            System.out.println("Equilibrium index is: " + mid);
        } else if (rightSum > leftSum) {
            findIndex(arr, mid + 1, leftSum, rightSum);
        } else {
            findIndex(arr, mid - 1, leftSum, rightSum);
        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 1, 3, 2, 4 };
        int mid = 0 + (arr.length - 1 - 0) / 2;

        findIndex(arr, mid, 0, arr.length - 1);
    }
}
