package BinaryTree;

import BinaryTree.*;
import java.util.*;

public class CheckSubtree {

    static void checkSubtree(TreeNode root, TreeNode subRoot, Boolean found) {
        if (root == null || subRoot == null)
            return;

        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> subQ = new LinkedList<>();

        q.add(root);
        subQ.add(subRoot);

        while (!q.isEmpty()) {

        }

    }

    public static void main(String args[]) {
        TreeNode root = Traversal.createOfHeightThree();

        TreeNode subRoot = new TreeNode(30);
        subRoot.left = new TreeNode(60);
        subRoot.right = new TreeNode(70);
        Boolean found = false;
        System.out.println("root");
        LevelOrderTraversal.printLevelOrder(root);
        System.out.println("subRoot");
        LevelOrderTraversal.printLevelOrder(subRoot);
        checkSubtree(root, subRoot, found);
    }
}
