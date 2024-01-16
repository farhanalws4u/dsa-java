
public class nonRepeating {
    static void findNonRepeating(int[] arr) {
        int res = 0;
        for (int num : arr) {
            res ^= num;
        }
        System.out.println("the non repeating number is " + res);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 3, 4, 2 };
        findNonRepeating(arr);
    }
}
