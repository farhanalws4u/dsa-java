package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(1);
        result.add(new ArrayList<>(temp));

        if (numRows == 1) {
            return result;
        }

        temp.add(1);
        result.add(new ArrayList<>(temp));

        if (numRows == 2) {
            return result;
        }

        if (numRows >= 3) {

            for (int i = 3; i <= numRows; i++) {
                ArrayList<Integer> curr = new ArrayList<>();
                int count = 1;
                curr.add(1); // leftmost 1 of row

                while (count < i - 1) {
                    int ithElement = temp.get(count - 1) + temp.get(count);
                    curr.add(ithElement);
                    count++;
                }
                curr.add(1); // rightmost 1 of row
                temp = curr;
                result.add(new ArrayList<>(temp));
            }
        }

        return result;

    }
}
