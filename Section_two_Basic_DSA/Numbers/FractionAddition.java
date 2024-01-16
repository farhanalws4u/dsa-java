package Numbers;

import java.util.*;

public class FractionAddition {

    static void findSum(int numeOne, int denOne, int numeTwo, int denTwo) {
        int resNumerator = numeOne * denTwo + numeTwo * denOne;
        int resDenominator = denOne * denTwo;

        int gcd = findGcd(resNumerator, resDenominator);

        int finalNumerator = resNumerator / gcd;
        int finalDenominator = resDenominator / gcd;

        System.out.println("Sum of fractions is " + finalNumerator + "/" + finalDenominator);
    }

    static int findGcd(int a, int b) {

        if (b == 0)
            return a;

        return findGcd(b, a % b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numerator one");
        int numeOne = sc.nextInt();
        System.out.println("Enter denominator one");
        int denOne = sc.nextInt();
        System.out.println("Enter numerator two");
        int numeTwo = sc.nextInt();
        System.out.println("Enter denominator two");
        int denTwo = sc.nextInt();

        findSum(numeOne, denOne, numeTwo, denTwo);
        sc.close();
    }
}
