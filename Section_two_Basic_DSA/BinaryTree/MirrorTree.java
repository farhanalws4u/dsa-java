
import java.util.LinkedList;
import java.util.Queue;

// import interview_self_paced.Section_two_Basic_DSA.BinaryTree.*;

public class MirrorTree {

    static void convertToMirror(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode nextFromQ = q.remove();
            if (nextFromQ.left != null)
                q.add(nextFromQ.left);
            if (nextFromQ.right != null)
                q.add(nextFromQ.right);

            TreeNode temp;
            temp = nextFromQ.left;
            nextFromQ.left = nextFromQ.right;
            nextFromQ.right = temp;

        }

    }

    public static void main(String args[]) {
        TreeNode root = Traversal.createOfHeightThree();
        convertToMirror(root);
        LevelOrderTraversal.printLevelOrder(root);
    }
}
