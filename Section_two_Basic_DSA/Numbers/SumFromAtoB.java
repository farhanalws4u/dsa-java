public class SumFromAtoB {

    static int findSum(int a, int b, int sum) {

        if (a == b) {
            return a;
        }

        return a + findSum(a + 1, b, sum);
    }

    public static void main(String args[]) {
        int a = 5;
        int b = 10;
        int sum = 0;
        sum = findSum(a, b, sum);
        System.out.println("sum is " + sum);
    }
}