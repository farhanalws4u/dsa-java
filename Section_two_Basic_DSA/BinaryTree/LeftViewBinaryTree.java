package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTree.*;

public class LeftViewBinaryTree {

    static void getLeftView(TreeNode root) {
        int h = HeightOfBinaryTree.getHeight(root);
        for (int i = 1; i <= h; i++) {
            getLeft(root, i);
        }
    }

    static void getLeft(TreeNode root, int level) {
        if (root == null)
            return;

        if (level == 1)
            System.out.println(root.value);
        else {

            getLeft(root.left, level - 1);

            if (root.left == null)
                getLeft(root.right, level - 1);
        }
    }

    static void leftViewUsingQueue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (q.isEmpty() != true) {

            TreeNode nextFromQ = q.remove();

            System.out.println(nextFromQ.value);

            if (nextFromQ.left != null)
                q.add(nextFromQ.left);
            else if (nextFromQ.left == null && nextFromQ.right != null)
                q.add(nextFromQ.right);
        }
    }

    static void rightViewUsingQueue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (q.isEmpty() != true) {

            TreeNode nextFromQ = q.remove();

            System.out.println(nextFromQ.value);

            if (nextFromQ.right != null)
                q.add(nextFromQ.right);
            else if (nextFromQ.right == null && nextFromQ.left != null)
                q.add(nextFromQ.left);
        }
    }

    public static void main(String args[]) {
        TreeNode root = Traversal.createOfHeightThree();
        // getLeftView(root);
        // leftViewUsingQueue(root);
        rightViewUsingQueue(root);
    }
}
