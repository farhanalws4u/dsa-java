public class ReverseNumRecursive {

    static int reverse(int num, int res) {

        if (num == 0) {
            return res;
        }

        int rem = num % 10;
        res = res * 10 + rem;

        return reverse(num / 10, res);

    }

    public static void main(String[] args) {
        System.out.println(reverse(1234, 0));
    }
}
