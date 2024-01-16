package Recursion;

import java.util.*;

public class LengthOfString {

    static int findLength(String str) {
        if (str.equals(""))
            return 0;

        return 1 + findLength(str.substring(1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Length of String is " + findLength(str));
        sc.close();
    }
}
