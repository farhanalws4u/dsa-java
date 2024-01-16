package interview_self_paced.Section_two_Basic_DSA.BinaryTree;

import interview_self_paced.Section_two_Basic_DSA.BinaryTree.Traversal;

public class HeightOfBinaryTree {

    static int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        else {
            return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        }
    }

    public static void main(String[] args) {
        TreeNode root = Traversal.createOfHeightThree();

        System.out.println(getHeight(root));
    }
}
