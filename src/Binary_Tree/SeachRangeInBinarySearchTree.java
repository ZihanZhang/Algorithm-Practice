package Binary_Tree;

import java.util.ArrayList;

/**
 * Created by ZihanZhang on 17/6/16.
 */
public class SeachRangeInBinarySearchTree {
    ArrayList<Integer> results = new ArrayList<Integer>();

    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {


        search(root, k1, k2);

        return results;
    }

    private void search(TreeNode root, int k1, int k2) {
        if (root == null) {
            return;
        }

        if (root.value >= k1 && root.value <= k2) {
            results.add(root.value);
        }
        else if (root.value > k2) {
            search(root.left, k1, k2);
        }
        else {
            search(root.right, k1, k2);
        }
    }
}
