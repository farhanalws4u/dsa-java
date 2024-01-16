public class SumOfDigitsRecur {

    static int sumRecur(int num) {

        if (num == 0) {
            return 0;
        }

        return num % 10 + sumRecur(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumRecur(23438));
    }
}
