package Sorted_Array;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by ZihanZhang on 17/6/3.
 */
public class MergeSortedArray {
    public ArrayList<Integer> mergeSortedArray(ArrayList<Integer> A, ArrayList<Integer> B) {
        int a = 0, b = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();

        while (a < A.size() - 1 && b < B.size() - 1) {
            if (A.get(a) < B.get(b)) {
                result.add(A.get(a));
                a++;
            }
            else {
                result.add(B.get(b));
                b++;
            }
        }

        return result;
    }
}
