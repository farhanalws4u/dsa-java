import java.util.*;

public class Factor {

    static void factorIterative(int num) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {

                if (i == num / i)
                    factors.add(i);
                else {
                    factors.add(num / i);
                    factors.add(i);
                }
            }
        }

        factors.forEach(f -> System.out.print(" " + f));
    }

    public static void main(String args[]) {
        factorIterative(100);
    }
}
