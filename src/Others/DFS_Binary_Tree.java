package Others;

import java.util.Stack;

/**
 * Created by ZihanZhang on 17/9/18.
 */
public class DFS_Binary_Tree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public boolean search(TreeNode root, int target) {
        if (root == null) {
            return true;
        }

        boolean left = search(root.left, target);
        boolean right = search(root.right, target);
        if (left || right || root.val == target) {
            return true;
        }
        else {
            return false;
        }
    }
}
