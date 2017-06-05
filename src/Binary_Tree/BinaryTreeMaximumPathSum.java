package Binary_Tree;

/**
 * Created by ZihanZhang on 17/6/4.
 */
public class BinaryTreeMaximumPathSum {
    class TreeNode {
        TreeNode left, right;
        int value;
    }

// Wrong! could not include root!
//    public int maxPathSum(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//
//        return Math.max(maxPathSum(root.right) + root.value, maxPathSum(root.left) + root.value);
//    }
}
