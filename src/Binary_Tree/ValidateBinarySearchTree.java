package Binary_Tree;

/**
 * Created by ZihanZhang on 17/6/16.
 */
//how to deal with bound problem?
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {

        if (root == null) {
            return true;
        }

        //solution: avoid value
        if (root.left.value < root.value && root.right.value > root.value) {
            if (isValidBST(root.left) && isValidBST(root.right)) {
                return true;
            }
            else return false;
        }
        else return false;
    }
}
