package Data_Structure;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by ZihanZhang on 17/6/23.
 */
//Stack can be used on latest storage.
//Can be determined when pushing object
public class MinStack {
    Stack minstack;

    public MinStack() {
        minstack = new Stack();
    }

    public void push(int number) {
        minstack.push(number);
    }

    public int pop() {
        int popn = (int)minstack.peek();
        minstack.pop();
        return popn;
    }

    public int min() {
        ArrayList<Integer> helper = new ArrayList<Integer>();
        int min = Integer.MAX_VALUE;

        if (minstack.peek() == null) {
            return -1;
        }

        while(minstack.peek() != null) {
            int hmin = (int)minstack.peek();
            helper.add(hmin);
            if (hmin < min) {
                min = hmin;
            }
            minstack.pop();
        }

        for (int i = helper.size() - 1; i >= 0; i--) {
            minstack.push(helper.indexOf(i));
        }

        return min;
    }
}
