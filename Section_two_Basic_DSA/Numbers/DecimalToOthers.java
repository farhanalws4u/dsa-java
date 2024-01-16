package Numbers;

import java.util.*;

public class DecimalToOthers {

    static void toBinary(int num) {
        String binary = "";

        while (num != 0) {
            int ans = num / 2;
            int rem = num % 2;
            num = ans;
            binary = rem + binary;
        }
        System.out.println("Binary number is " + binary);
    }

    static void toOctal(int num) {
        String octal = "";

        while (num != 0) {
            int ans = num / 8;
            int rem = num % 8;
            num = ans;
            octal = rem + octal;
        }
        System.out.println("octal number is " + octal);
    }

    static void toHexaDecimal(int num) {
        String finalHex = "";
        String arr[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
        List<String> table = Arrays.asList(arr);

        while (num != 0) {
            int ans = num / 16;
            int rem = num % 16;
            String hexRem = table.get(rem);
            num = ans;
            finalHex = hexRem + finalHex;
        }
        System.out.println("Hexa decimal number is " + finalHex);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        toBinary(num);
        toOctal(num);
        toHexaDecimal(num);
        sc.close();
    }
}
