import java.util.*;

public class ArmstrongNum {

    static boolean checkArm(int num) {
        int sum = 0;
        int pow = countNumOfDigit(num);
        int temp = num;

        for (int i = 0; i < pow; i++) {
            sum = sum + (int) Math.pow(num % 10, pow);
            num = num / 10;
        }

        if (temp == sum)
            return true;
        else
            return false;

    }

    static int countNumOfDigit(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static boolean armStrongRecursion(int num) {
        int temp = num;
        int pow = countNumOfDigit(num);
        int res = checkRecursive(num, pow, 0);
        if (res == temp)
            return true;
        else
            return false;
    }

    static int checkRecursive(int num, int pow, int sum) {
        if (num == 0)
            return sum;

        sum = sum + (int) Math.pow(num % 10, pow);

        return checkRecursive(num / 10, pow, sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        // System.out.println(checkArm(num));
        System.out.println(armStrongRecursion(num));

        in.close();
    }
}
