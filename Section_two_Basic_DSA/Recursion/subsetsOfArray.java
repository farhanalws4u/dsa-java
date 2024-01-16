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
        curr.remove(curr.size() - 1);

    }

    public static void main(String args[]) {
        int arr[] = { 0 };
        subsets(arr);
        System.out.println(finalRes);
    }

}
