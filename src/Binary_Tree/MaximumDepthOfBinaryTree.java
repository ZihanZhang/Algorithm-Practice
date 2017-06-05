package Binary_Tree;

/**
 * Created by ZihanZhang on 17/6/4.
 */


public class MaximumDepthOfBinaryTree {

    class TreeNode {
        TreeNode left, right;
    }
//Better solution: if (root == null) return 0;
    public int maxDepth(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 0;
        }

        if (maxDepth(root.left) > maxDepth(root.right)) {
            return maxDepth(root.left) + 1;
        }
        else return maxDepth(root.right) + 1;
    }
}
