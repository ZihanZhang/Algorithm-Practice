package Others;

import java.util.Stack;

/**
 * Created by ZihanZhang on 17/9/19.
 */
public class DFS_Binary_Tree_Iteration {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public boolean search(TreeNode root, int target) {
        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            TreeNode node = st.pop();

            if (node.val == target) {
                return true;
            }

            st.push(node.right);
            st.push(node.left);
        }

        return false;

    }
}
