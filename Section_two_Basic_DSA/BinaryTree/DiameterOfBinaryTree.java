package BinaryTree;

import org.w3c.dom.Node;

import BinaryTree.*;

public class DiameterOfBinaryTree {

    static int findDiameter(TreeNode root) { // works in O(n^2)

        if (root == null) {
            return 0;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        int currentDiameter = leftHeight + rightHeight + 1; // diameter of tree when root is included

        int leftDiameter = findDiameter(root.left);
        int rightDiameter = findDiameter(root.right);

        return Math.max(currentDiameter, Math.max(leftDiameter, rightDiameter));

    }

    static int getHeight(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + Math.max(getHeight(root.left), getHeight(root.right));

    }

    // diameter of tree can also be calculated using the height function because
    // diameter is nothing but the height of the left sub tree plus the height of
    // the right sub tree.

    static int diameterOpt(TreeNode root, Height height) {

        Height lh = new Height();
        Height rh = new Height();
        if (root == null) {
            height.h = 0;
            return 0;
        }

        int ldiameter = diameterOpt(root.left, lh);
        int rdiameter = diameterOpt(root.right, rh);

        height.h = Math.max(lh.h, rh.h) + 1;
        return Math.max(lh.h + rh.h + 1,
                Math.max(ldiameter, rdiameter));
    }

    public static void main(String[] args) {
        TreeNode root = Traversal.createOfHeightThree();
        System.out.println(findDiameter(root));
        Height height = new Height();
        System.out.println(diameterOpt(root, height));
    }

}

class Height {
    int h;
}
