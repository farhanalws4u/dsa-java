public class SubArrayWithMaxSum {

    static void findMaxSumNaive(int[] arr) { // find subArrays and sum them to find max sum.
        int finalSum = Integer.MIN_VALUE;
        for (int start = 0; start < arr.length; start++) {

            for (int end = 0; end < arr.length; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += arr[i];
                }
                finalSum = Math.max(sum, finalSum);
            }

        }
        System.out.println("Max sum of subarray is " + finalSum);
    }

    // Efficient approach using Kadane's algorithm.

    static void findMaxSumEfficient(int[] arr) {
        int sum = 0;
        int finalSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if (sum > finalSum)
                finalSum = sum;

            if (sum < 0)
                sum = 0;
        }
        System.out.println("Maximum sum of subArray is " + finalSum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        // findMaxSumNaive(arr);
        findMaxSumEfficient(arr);
    }
}
