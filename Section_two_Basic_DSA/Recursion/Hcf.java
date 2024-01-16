package Recursion;

import java.util.*;

public class Hcf {

    static int findGCD(int a, int b) {
        if (b == 0)
            return a;

        return findGCD(b, a % b);
    }

    static int getLcm(int a, int b) {
        int hcf = findGCD(a, b);
        int lcm = (a * b) / hcf;
        return lcm;
    }

    public static void main(String[] args) {
        int numOne = 12;
        int numTwo = 8;
        System.out.println(findGCD(numOne, numTwo));
        System.out.println(getLcm(numOne, numTwo));
    }
}
