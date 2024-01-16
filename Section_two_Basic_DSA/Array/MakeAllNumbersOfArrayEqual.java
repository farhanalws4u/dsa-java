public class MakeAllNumbersOfArrayEqual {

    static boolean checkForEqual(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            while (arr[i] % 2 == 0) {
                arr[i] /= 2;
            }
            while (arr[i] % 3 == 0) {
                arr[i] /= 3;
            }
        }

        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] != arr[j + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 50, 75, 100 };

        System.out.println(checkForEqual(arr));
    }
}
