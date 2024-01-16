public class Power {

    static double powerRecursive(int num, int pow) {

        if (pow == 1) {
            return num;
        }

        return num * powerRecursive(num, --pow);
    }

    static double powerIterative(int num, int pow) {
        double res = 1;

        while (pow != 0) {
            res = res * num;
            pow--;
        }

        return res;
    }

    public static void main(String[] args) {
        // System.out.println(powerRecursive(3, 3));
        System.out.println(powerIterative(4, 3));
    }
}
