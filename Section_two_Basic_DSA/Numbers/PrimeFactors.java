import java.util.*;

public class PrimeFactors {

    static void findFactors(int num, ArrayList<Integer> result) {

        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                int x = num;
                while (x % i == 0) {
                    System.out.print(i + " ");
                    x /= i;
                }
            }
        }
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        ArrayList<Integer> factors = new ArrayList<>();
        findFactors(12, factors);
        factors.forEach(f -> System.out.println(f));
    }
}
