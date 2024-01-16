package interview_self_paced.Section_two_Basic_DSA.BinaryTree;

public class Traversal {

    static void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.println(root.value);
            inOrderTraversal(root.right);
        }
    }

    static void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.println(root.value);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    static void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.value);
        }
    }

    public static TreeNode createOfHeightThree() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(70);
        root.right.right.right = new TreeNode(90);
        root.right.right.left = new TreeNode(80);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.right = new TreeNode(70);
        inOrderTraversal(root);
    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
