public class PerfectNumber {

    static boolean checkPerfect(double n) {

        double sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i == 1) {
                    sum = sum + i;
                } else if (n / i == i) {
                    sum = sum + i;
                } else {
                    sum = sum + n / i + i;
                }
            }
        }
        System.out.println(sum);
        if (sum == n)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        double n = 28;
        System.out.println(checkPerfect(n));
    }
}
