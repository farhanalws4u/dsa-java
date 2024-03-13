package BinaryTree;

public class PrintNodeAtKDistance {

    static void printNodes(TreeNode root, int k) {
        if (root == null)
            return;
        if (k == 0)
            System.out.println(root.value);
        else {
            printNodes(root.left, k - 1);
            printNodes(root.right, k - 1);
        }
    }

    public static void main(String args[]) {
        TreeNode root = Traversal.createOfHeightThree();
        printNodes(root, 2);
    }
}
