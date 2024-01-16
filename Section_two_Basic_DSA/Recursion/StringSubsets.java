package Recursion;

import java.util.*;

class StringSubsets {

    static ArrayList<String> res = new ArrayList<>();

    static void findSubsets(String str, String curr, int index) {
        if (index >= str.length()) {
            // base case
            res.add(curr);
            return;
        }

        // exclude
        findSubsets(str, curr, index + 1);

        // include
        findSubsets(str, curr + str.charAt(index), index + 1);
    }

    public static void main(String args[]) {
        String str = "abc";

        findSubsets(str, "", 0);
        System.out.println(res);
    }
}