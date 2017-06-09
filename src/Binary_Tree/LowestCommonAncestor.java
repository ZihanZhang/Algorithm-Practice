package Binary_Tree;

/**
 * Created by ZihanZhang on 17/6/8.
 */

//Using Parent is better
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncester(TreeNode root, TreeNode A, TreeNode B) {
        if ((isSubNode(root.left, A) && isSubNode(root. right, B) || (isSubNode(root.right, A) && isSubNode(root.left, B)))) {
            return root;
        }

        if(lowestCommonAncester(root.left, A, B) != null) {
            return lowestCommonAncester(root.left, A, B);
        }

        if(lowestCommonAncester(root.right, A, B) != null) {
            return lowestCommonAncester(root.right, A, B);
        }

        return null;
    }

    public boolean isSubNode(TreeNode root, TreeNode sub) {
        if (root == null) {
            return false;
        }

        if (root == sub) {
            return true;
        }

        if (isSubNode(root.left, sub) || isSubNode(root.right, sub)) {
            return true;
        }

        return false;
    }
}
