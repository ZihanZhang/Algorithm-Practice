package Data_Structure;

import Binary_Tree.TreeNode;

/**
 * Created by ZihanZhang on 17/6/24.
 */
public class MaxTree {
    public static TreeNode maxTree(int[] A) {
        if (A.length == 0) {
            return null;
        }

        TreeNode tn = new TreeNode();
        int root = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > root) {
                root = A[i];
            }
            index = i;
        }

        tn.value = root;

        int[] left = new int[index];
        int[] right = new int[A.length - index];

        for (int i = 0; i < index; i++) {
            left[i] = A[i];
        }
        for (int i = 0; i < A.length - index; i++) {
            right[i] = A[index + i];
        }

        tn.left = maxTree(left);
        tn.right = maxTree(right);

        return tn;
    }
}
