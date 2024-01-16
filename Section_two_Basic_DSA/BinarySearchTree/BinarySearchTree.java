package interview_self_paced.Section_two_Basic_DSA.BinarySearchTree;

public class BinarySearchTree {

    public static BstNode insert(BstNode root, int key) {
        if (root == null) {
            BstNode newNode = new BstNode(key);
            return newNode;
        }
        if (key < root.data) { // go to left sub tree
            root.left = insert(root.left, key);
        }
        if (key > root.data) { // go to right sub tree
            root.right = insert(root.right, key);
        }
        return root;
    }

    public static boolean search(BstNode root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        boolean leftFound = false;
        boolean rightFound = false;

        if (key < root.data)
            leftFound = search(root.left, key);
        else if (key > root.data)
            rightFound = search(root.right, key);

        return leftFound || rightFound;
    }

    public static void delete(BstNode root, int key) {
        root = deleteRecursive(root, key);
    }

    public static BstNode deleteRecursive(BstNode root, int key) {
        if (root == null)
            return root;

        // search for the element
        if (key < root.data) {
            root.left = deleteRecursive(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRecursive(root.right, key);
        } else {
            // means element is found and now there comes two conditions on the element.

            // 1.) Node has only on child node either left or right.

            if (root.right == null) {
                BstNode temp = root.left;
                return temp;
            } else if (root.left == null) {
                BstNode temp = root.right;
                return temp;
            }

            // 2.) Node has two child nodes.

            int inOrderValue = getInOrderSuccessor(root.right);
            root.data = inOrderValue;

            // now when data of inOrderSuccessor is copied to the deleted node, delete
            // inOrderSuccessor also

            deleteRecursive(root.right, inOrderValue);

        }

        return root;

    }

    public static int getInOrderSuccessor(BstNode root) {
        BstNode temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.data;
    }

    public static void inOrder(BstNode root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static void main(String args[]) {
        /*
         * we have to create the Bst with given data 45,10,70,90,50,7,12,
         * 
         * and it will look like
         * 
         * 45
         * / \
         * 10 70
         * / \ / \
         * 7 12 50 90
         */
        BstNode root = null;
        root = insert(root, 45);
        root = insert(root, 10);
        root = insert(root, 70);
        root = insert(root, 90);
        root = insert(root, 50);
        root = insert(root, 7);
        root = insert(root, 12);

        // traverse to check
        inOrder(root);
        // if (search(root, 10)) {
        // System.out.println("found element in tree");
        // } else {
        // System.out.println("element is not present in the tree");
        // }
        delete(root, 70);
        System.out.println("After Deletion");
        inOrder(root);

    }

}

class BstNode {
    int data;
    BstNode left, right;

    BstNode(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}