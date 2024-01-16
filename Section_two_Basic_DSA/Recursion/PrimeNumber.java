package Recursion;

import java.util.*;

public class PrimeNumber {

    static boolean checkPrime(int num, int i) {
        if (num <= 2)
            return (i == 2) ? true : false;

        if (num % i == 0)
            return false;

        if (i * i > num)
            return true; // means no number can divide the given number up to its root range.

        return checkPrime(num, i + 1);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");

        int num = sc.nextInt();
        int i = 2;
        System.out.println(checkPrime(num, i));
        sc.close();
    }
}
