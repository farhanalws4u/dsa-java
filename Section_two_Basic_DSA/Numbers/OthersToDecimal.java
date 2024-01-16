package Numbers;

import java.util.*;

public class OthersToDecimal {

    static void fromBinaryToDecimal(int num) {
        double decimal = 0;
        int pow = 0;
        int temp = num;

        while (num != 0) {
            int rem = num % 10;
            decimal = decimal + rem * Math.pow(2, pow);
            num = num / 10;
            pow++;
        }
        System.out.println("Decimal of " + temp + "is " + decimal);
    }

    static void fromOctalToDecimal(int num) {
        double decimal = 0;
        int pow = 0;
        int temp = num;

        while (num != 0) {
            int rem = num % 10;
            decimal = decimal + rem * Math.pow(8, pow);
            num = num / 10;
            pow++;
        }
        System.out.println("Decimal of " + temp + "is " + decimal);
    }

    static void fromHexaDecimalToDecimal(String num) {

        String arr[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
        List<String> table = Arrays.asList(arr);

        double decimal = 0;
        int pow = 0;
        String temp = num;
        int i = num.length() - 1;

        while (i >= 0) {
            char rem = num.charAt(i);

            decimal = decimal + table.indexOf(String.valueOf(rem)) * Math.pow(16, pow);
            pow++;
            i--;
        }
        System.out.println("Decimal of " + temp + "is " + decimal);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter 1 binary to decimal\n Enter 2 for octal to decimal \n Enter 3 for hexa decimal to decimal");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter binary number");
                int binaryNum = sc.nextInt();
                fromBinaryToDecimal(binaryNum);
                break;

            case 2:
                System.out.println("Enter octal number");
                int octalNum = sc.nextInt();
                fromOctalToDecimal(octalNum);
                break;

            case 3:
                System.out.println("Enter hexa decimal number");
                sc.nextLine();
                String hexaDecimalNum = sc.nextLine();
                fromHexaDecimalToDecimal(hexaDecimalNum);
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
        sc.close();
    }
}
