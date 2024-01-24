package BinaryTree;

import BinaryTree.Traversal;

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
