package Others;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ZihanZhang on 17/9/19.
 */
public class BFS_Binary_Tree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public boolean search(TreeNode root, int target) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.val == target) {
                return true;
            }

            queue.add(node.left);
            queue.add(node.right);
        }

        return false;
    }
}
