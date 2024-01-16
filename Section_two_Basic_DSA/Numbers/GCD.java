package Numbers;

import java.util.*;

public class GCD {

    static int findGcdNaive(int numOne, int numTwo) {
        ArrayList<Integer> factorsOne = new ArrayList<>();
        ArrayList<Integer> factorsTwo = new ArrayList<>();

        for (int i = 2; i <= Math.sqrt(numOne); i++) {
            if (numOne % i == 0) {
                if (numOne / i == i) {
                    factorsOne.add(i);
                } else {
                    factorsOne.add(i);
                    factorsOne.add(numOne / i);
                }
            }
        }

        for (int i = 2; i <= Math.sqrt(numTwo); i++) {
            if (numTwo % i == 0) {
                if (numTwo / i == i) {
                    factorsTwo.add(i);
                } else {
                    factorsTwo.add(i);
                    factorsTwo.add(numTwo / i);
                }
            }
        }

        factorsOne.retainAll(factorsTwo);
        Collections.sort(factorsOne);
        return factorsOne.get(factorsOne.size() - 1);
    }

    static int findGcdEfficientByEuclidGcd(int numOne, int numTwo) {

        if (numTwo == 0)
            return numOne;

        return findGcdEfficientByEuclidGcd(numTwo, numOne % numTwo);
    }

    static int anotherMethod(int numOne, int numTwo) {
        int hcf = 0;
        for (int i = 1; i < numOne / 2 && i < numTwo / 2; i++) {
            if (numOne % i == 0 && numTwo % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOne = sc.nextInt();
        int numTwo = sc.nextInt();

        // System.out.println(findGcdNaive(numOne, numTwo));
        System.out.println(anotherMethod(numOne, numTwo));
        sc.close();
    }
}
