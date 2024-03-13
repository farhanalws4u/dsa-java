package BinaryTree;

import java.util.Deque;
import java.util.LinkedList;

import BinaryTree.*;

public class LevelOrderSpiral {

    static void levelSpiral(TreeNode root) {
        int h = HeightOfBinaryTree.getHeight(root);
        boolean reverse = false;
        for (int i = 1; i <= h; i++) {
            printLevelsInSpiral(root, i, reverse);
            reverse = !reverse;
        }
    }

    static void printLevelsInSpiral(TreeNode root, int level, boolean reverse) {
        if (root == null)
            return;

        if (level == 1)
            System.out.println(root.value);

        if (level > 1) {
            if (!reverse) {
                printLevelsInSpiral(root.left, level - 1, reverse);
                printLevelsInSpiral(root.right, level - 1, reverse);
            } else { // if reverse is true then print in reverse form to make spiral
                printLevelsInSpiral(root.right, level - 1, reverse);
                printLevelsInSpiral(root.left, level - 1, reverse);
            }
        }
    }

    // spiral level order traversal using dequeue

    static void spiralTraversalUsingDequeue(TreeNode root) {
        if (root != null) {
            Deque<TreeNode> dq = new LinkedList<>();
            Boolean reverse = false;
            dq.addFirst(root);

            while (dq.isEmpty() != true) {
                if (!reverse) {
                    TreeNode next = dq.getFirst();
                    System.out.println(next.value);

                    if (next.left != null)
                        dq.addLast(next.left);
                    if (next.right != null)
                        dq.addLast(next.right);
                } else {
                    TreeNode next = dq.getLast();
                    System.out.println(next.value);

                    if (next.right != null)
                        dq.addLast(next.left);
                    if (next.left != null)
                        dq.addLast(next.right);
                }
                reverse = !reverse;
            }
        }
    }

    public static void main(String args[]) {
        TreeNode root = Traversal.createOfHeightThree();
        System.out.println("In spiral form");
        spiralTraversalUsingDequeue(root);
        System.out.println("In normal level order");
        ;
        LevelOrderTraversal.printLevelOrder(root);
    }
}
