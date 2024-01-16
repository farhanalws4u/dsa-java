public class PrimeNumFactorPrimeFactor {

    static boolean primeNumber(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;
        return true;

    }

    static void factors(int n) {

        for (int i = 2; i < Math.sqrt(n); i++) {

            if (n % i == 0) {

                if (n / i == i) {
                    System.out.println(i);
                } else {
                    System.out.println(i + " " + n / i);
                }
            }
        }
    }

    static void primeFactors(int n) {

        for (int i = 2; i <= n; i++) {

            if (primeNumber(i)) {

                int x = n;

                while (x % i == 0) {
                    System.out.println(i);
                    x = x / i;
                }
            }
        }

    }

    public static void main(String arg[]) {
        primeFactors(25);
    }
}
