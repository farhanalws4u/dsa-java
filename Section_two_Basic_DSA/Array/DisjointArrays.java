import java.util.*;

public class DisjointArrays {

    static boolean checkDisjointNaive(int[] arrOne, int[] arrTwo) {
        int lenOne = arrOne.length;
        int lenTwo = arrTwo.length;

        for (int i = 0; i < lenOne; i++) {

            for (int j = 0; j < lenTwo; j++) {
                if (arrOne[i] == arrTwo[j])
                    return false;
            }
        }

        return true;
    }

    static boolean checkDisjointEfficient(int[] arrOne, int[] arrTwo) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arrOne.length; i++) {
            set.add(arrOne[i]);
        }

        for (int j = 0; j < arrTwo.length; j++) {

            if (set.contains(arrTwo[j])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        int arrOne[] = { 1, 2, 3, 4 };
        int arrTwo[] = { 6, 8 };

        // System.out.println(checkDisjointNaive(arrOne, arrTwo));
        System.out.println(checkDisjointEfficient(arrOne, arrTwo));
    }
}

// we can also check that one array is subset of another array using the same
// approach.
