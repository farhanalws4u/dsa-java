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

        // here we are not using the backtracking to remove last element from the curr
        // string because every time we are appending the character to curr and passing
        // it to recursive call, a copy of string is created and gets passed.
    }

    public static void main(String args[]) {
        String str = "abc";

        findSubsets(str, "", 0);
        System.out.println(res);
    }
}