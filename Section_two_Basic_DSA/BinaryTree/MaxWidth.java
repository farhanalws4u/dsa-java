package BinaryTree;

import BinaryTree.*;

public class MaxWidth {

    static int getMaxWidth(TreeNode root) {
        int h = HeightOfBinaryTree.getHeight(root);
        int finalWidth = 0;
        for (int i = 1; i <= h; i++) {
            int currWidth = printLevels(root, i);
            if (currWidth > finalWidth)
                finalWidth = currWidth;
        }
        return finalWidth;
    }

    static int printLevels(TreeNode root, int level) {
        if (root == null)
            return 0;

        if (level == 1) {
            return 1;
        }
        if (level > 1) {
            int leftWidth = printLevels(root.left, level - 1);
            int rightWidth = printLevels(root.right, level - 1);
            return leftWidth + rightWidth;
        }
        return 0;
    }

    public static void main(String args[]) {
        TreeNode root = Traversal.createOfHeightThree();
        System.out.println("maximum width is " + getMaxWidth(root));
    }
}
