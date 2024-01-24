package BinaryTree;

import BinaryTree.*;

public class CheckBalanceTree {

    static boolean checkBalanced(TreeNode root) {

        if (root != null) {

            int leftHeight = HeightOfBinaryTree.getHeight(root.left);
            int rightHeight = HeightOfBinaryTree.getHeight(root.right);

            if (Math.abs(rightHeight - leftHeight) > 1)
                return false;
            else {
                checkBalanced(root.left);
                checkBalanced(root.right);
            }
        }

        return true;
    }

    public static void main(String args[]) {
        TreeNode root = Traversal.createOfHeightThree();
        // root.right.right.right.right = new TreeNode(100);
        // root.right.right.right.right.right = new TreeNode(110);
        System.out.println(checkBalanced(root));
    }
}
