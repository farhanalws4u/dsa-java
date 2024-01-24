package BinaryTree;

import BinaryTree.*;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    static void printLevelOrder(TreeNode root) {

        if (root != null) {
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                TreeNode current = q.remove();

                if (current == null) {
                    System.out.println(" ");

                    if (!q.isEmpty()) {
                        q.add(null);
                    }
                } else {
                    System.out.print(current.value + " ");

                    if (current.left != null)
                        q.add(current.left);
                    if (current.right != null)
                        q.add(current.right);
                }
            }
        }
    }

    static void printLevelOrderRecursive(TreeNode root) {
        int h = HeightOfBinaryTree.getHeight(root);
        for (int i = 1; i <= h; i++) {
            printLevels(root, i);
        }
    }

    static void printLevels(TreeNode root, int level) {
        if (root == null)
            return;

        if (level == 1) {
            System.out.println(root.value);
        }
        if (level > 1) {
            printLevels(root.left, level - 1);
            printLevels(root.right, level - 1);
        }
    }

    static int getSize(TreeNode root) {
        if (root == null)
            return 0;

        int left = getSize(root.left);
        int right = getSize(root.right);
        return 1 + left + right;
    }

    public static void main(String args[]) {
        TreeNode root = null;
        root = Traversal.createTree(root);
        printLevelOrder(root);
        System.out.println("size of tree is " + getSize(root));
    }
}
