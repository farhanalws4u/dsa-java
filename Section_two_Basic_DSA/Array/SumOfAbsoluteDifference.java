public class SumOfAbsoluteDifference {

    static void findSum(int[] arr) {

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += Math.abs(arr[i] - arr[j]);
            }
            result = Math.min(sum, result);
        }

        System.out.println("Absolute sum of differences is: " + result);
    }

    public static void main(String args[]) {
        int[] arr = { 2, 4, 5, 3 };

        findSum(arr);
    }
}
