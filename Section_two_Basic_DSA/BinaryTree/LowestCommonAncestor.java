package interview_self_paced.Section_two_Basic_DSA.BinaryTree;

import java.util.ArrayList;

import interview_self_paced.Section_two_Basic_DSA.BinaryTree.*;

public class LowestCommonAncestor {

    static void getLowestAncestor(TreeNode root, int n1, int n2, ArrayList<Integer> pathOne,
            ArrayList<Integer> pathTwo) {

        if (root != null) {

            if (!findPath(root, n1, pathOne) && !findPath(root, n2, pathTwo)) {
                System.out.println("Cant find the ancestors.");
            }
        }
        int index;
        for (index = 0; index < pathOne.size() && index < pathTwo.size(); index++) {

            // If there is a mismatch break the loop.
            if (pathOne.get(index) != pathTwo.get(index))
                break;
        }
        // print the just previous value of mismatched value in array.
        System.out.println("Lowest Common Ancestor of " + n1 + " " + n2 + " is " +
                pathOne.get(index - 1));
    }

    static boolean findPath(TreeNode root, int num, ArrayList<Integer> pathArr) {

        if (root != null) {

            pathArr.add(root.value);

            if (root.value == num) {
                return true;
            } else {
                boolean first = findPath(root.left, num, pathArr);
                boolean second = findPath(root.right, num, pathArr);

                if (first || second)
                    return true;
            }
        }
        pathArr.remove(pathArr.size() - 1);

        return false;
    }

    public static void main(String[] args) {
        TreeNode root = Traversal.createOfHeightThree();
        ArrayList<Integer> pathOne = new ArrayList<>();
        ArrayList<Integer> pathTwo = new ArrayList<>();
        getLowestAncestor(root, 50, 80, pathOne, pathTwo);
    }
}
