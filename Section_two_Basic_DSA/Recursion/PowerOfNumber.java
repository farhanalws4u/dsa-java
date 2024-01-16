package Recursion;

import java.util.*;

public class PowerOfNumber {

    static double findPower(double num, double pow) {

        if (pow == 0)
            return 1;

        pow--;
        return num * findPower(num, pow);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base number");
        double num = sc.nextDouble();
        System.out.println("Enter the exponent");
        double pow = sc.nextDouble();
        System.out.print(findPower(num, pow));

        sc.close();
    }
}
