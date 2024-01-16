package Recursion;

import java.util.*;

public class StringPermutation {

    static void getPerm(String str) {
        StringBuilder _str = new StringBuilder(str); // converting into stringBuilder for swapping purpose.
        generate(_str, 0);
    }

    static void generate(StringBuilder str, int index) {

        // base case
        if (index >= str.length()) {
            System.out.println(str);
        }

        for (int j = index; j < str.length(); j++) { // "abc"
            swap(str, index, j);
            generate(str, index + 1);
            // backtrack
            swap(str, index, j);
        }
    }

    static void swap(StringBuilder str, int i, int j) {

        char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        getPerm(str);
        sc.close();
    }
}
