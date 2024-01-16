import java.util.*;

public class FibonacciSeries {

    // for series of n fibonacci numbers
    static void printUpToNTerms(int n) { // efficient

        ArrayList<Double> nums = new ArrayList<>();

        nums.add((double) 0);
        nums.add((double) 1);

        for (int i = 2; i < n; i++) {
            double temp = nums.get(i - 1) + nums.get(i - 2);
            nums.add(temp);
        }

        for (int j = 0; j < nums.size(); j++) {
            System.out.print(" " + nums.get(j));
        }
        // here if the requirement is for nth number then get the number from array and
        // return.
    }

    // for nth fibonacci number
    static int fibonacciRecursive(int n) { // inefficient
        if (n == 1)
            return 0;
        if (n == 2 || n == 3)
            return 1;

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        // printUpToNTerms(n);
        System.out.println(fibonacciRecursive(n));

        in.close();
    }
}
