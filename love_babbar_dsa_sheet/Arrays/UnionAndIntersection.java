package love_babbar_dsa_sheet.Arrays;

import java.util.*;

class UnionAndIntersection {

    static void union(int[] one, int[] two) { // this solution is submitted on gfg.
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < one.length; i++) {
            hs.add(one[i]);
        }

        for (int j = 0; j < two.length; j++) {
            hs.add(two[j]);
        }

        Iterator value = hs.iterator();

        while (value.hasNext()) {
            System.out.print(value.next() + " ");
        }

    }

    static void intersection(int[] one, int[] two) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < one.length; i++) {

        }

        for (int j = 0; j < two.length; j++) {

        }

        hm.forEach((k, v) -> {
            if (v > 1) {
                System.out.print(k + " ");
            }
        });
    }

    public static void main(String[] args) {
        int[] arrOne = new int[] { 2, 3, 4, 5 };
        int[] arrTwo = new int[] { 2, 3, 6, 7 };
        union(arrOne, arrTwo);
        intersection(arrOne, arrTwo);
    }
}