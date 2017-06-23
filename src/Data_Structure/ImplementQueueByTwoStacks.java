package Data_Structure;

import java.util.Stack;

/**
 * Created by ZihanZhang on 17/6/23.
 */
public class ImplementQueueByTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public ImplementQueueByTwoStacks() {
        // do initialization if necessary
    }

    public void push(int element) {
        stack1.push(element);

        for (int i = 0; i < stack1.size(); i++) {
            stack2.push(stack1.pop());
        }
    }

    public int pop() {
        return stack2.pop();
    }

    public int top() {
        return stack2.peek();
    }
}
