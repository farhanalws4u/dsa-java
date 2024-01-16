package Numbers;

import java.util.*;

public class NumAsSumOfTwoPrime {

    static void checkSum(int num) {
        int result = 0;
        int first = 0;
        int second = 0;
        boolean flag = false;

        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {
                for (int j = i; j < num; j++) {
                    if (isPrime(j)) {
                        result = i + j;
                    }
                    if (result == num) {
                        first = i;
                        second = j;
                        flag = true;
                        break;
                    }
                }
                if (result == num) {
                    break;
                }
            }
        }
        if (flag)
            System.out.println("i and j are" + first + " " + second);
        else {
            System.out.println("Number can not be expressed as a sum of prime numbers");
        }

    }

    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkSum(num);
        sc.close();
    }
}
