package Numbers;

import java.util.*;

public class ReplaceZeroWithOne {

    static void replace(int num) {
        String result = "";
        String str = Integer.toString(num);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                result = result + "1";
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println("Converted...." + Integer.valueOf(result));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        replace(num);
        sc.close();
    }
}
