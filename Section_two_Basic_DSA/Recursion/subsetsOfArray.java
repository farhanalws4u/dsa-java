
package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subsetsOfArray {

    static List<List<Integer>> finalRes = new ArrayList<>();

    public static void subsets(int[] nums) {
        ArrayList<Integer> curr = new ArrayList<>();

        findSubset(nums, curr, 0);
    }

    static void findSubset(int[] nums, ArrayList<Integer> curr, int index) {

        // base case
        if (index >= nums.length) {
            finalRes.add(new ArrayList<>(curr));
            return;
        }

        // exclude
        findSubset(nums, curr, index + 1);

        // include
        curr.add(nums[index]);
        findSubset(nums, curr, index + 1);

        // backtrack
        curr.remove(curr.size() - 1); // in c++ we don't need this line. see below explanation.

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3 };
        subsets(arr);
        System.out.println(finalRes);
    }

}

// if we implement this same implementation in C++ , when don't need to
// backtrack because in c++ a copy of curr array will be passed every time we
// make the recursive call but in java array is passed by default as reference
// not by value so we have to remove elements from the current array after it is
// printed or utilized in the answer.
