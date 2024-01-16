public class Factorial {

    static double fact(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * fact(n - 1);
    }

    static double factIterative(int n) {
        double res = 1;

        while (n != 1) {
            res = res * n;
            n--;
        }
        return res;
    }

    public static void main(String[] args) {
        // System.out.println(fact(4));
        System.out.println(factIterative(4));
    }
}