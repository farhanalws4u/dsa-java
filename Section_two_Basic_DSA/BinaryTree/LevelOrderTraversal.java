package interview_self_paced.Section_two_Basic_DSA.BinaryTree;

import interview_self_paced.Section_two_Basic_DSA.BinaryTree.*;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    static void printLevelOrder(TreeNode root) {

        if (root != null) {
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);

            while (q.isEmpty() != true) {

                TreeNode nextFromQ = q.remove();

                System.out.println(nextFromQ.value);

                if (nextFromQ.left != null)
                    q.add(nextFromQ.left);
                if (nextFromQ.right != null)
                    q.add(nextFromQ.right);
            }
        }
        return;
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
        TreeNode root = Traversal.createOfHeightThree();
        printLevelOrder(root);
        System.out.println(getSize(root));
    }
}
