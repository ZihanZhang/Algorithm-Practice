package Binary_Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ZihanZhang on 17/6/16.
 */
//How to deal with the midresult?
//while doesn't mean a loop, it's just a return mark
//You can change when to enqueue and dequeue
//when element can not be added to collection the add method throws an exception and offer doesn't
public class BinaryTreeLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        while(queue.isEmpty()) {
            ArrayList<Integer> midresult = new ArrayList<Integer>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();

                midresult.add(head.value);

                //should check if it's null
                if (head.left != null) {
                    queue.add(head.left);
                }
                if (head.right != null) {
                    queue.add(head.right);
                }
            }

            result.add(midresult);
        }

        return result;
    }
}
