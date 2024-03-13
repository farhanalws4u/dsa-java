package love_babbar_dsa_sheet.Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthMaxAndMin {

    static int findMax(int[] nums, int k) {
        // one naive way is to sort and return the element at index length-k;
        // here we will use priority queues to implement maxHeap. by default Priority
        // queues implement min heap but here with slight change we can implement the
        // maxHeap.

        PriorityQueue<Integer> mh = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            mh.add(nums[i]);
        }
        for (int i = 0; i < k - 1; i++) { // remove elements before the position.
            mh.poll();
        }

        return mh.poll();
    }

    static int findMin(int[] nums, int k) {

        PriorityQueue<Integer> mh = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            mh.add(nums[i]);
        }
        System.out.println(mh);
        for (int i = 0; i < k - 1; i++) { // remove elements before the position.
            mh.poll();
        }

        return mh.poll();
    }

    public static void main(String args[]) {
        int[] arr = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };

        System.out.println("4th Max " + findMax(arr, 4));
        System.out.println("4th Min " + findMin(arr, 4));
    }
}
