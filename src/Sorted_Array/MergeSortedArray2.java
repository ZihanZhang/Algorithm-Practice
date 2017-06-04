package Sorted_Array;

/**
 * Created by ZihanZhang on 17/6/3.
 */

//From http://www.code123.cc/docs/leetcode-notes/integer_array/merge_sorted_array_ii.html
//The point is, Do not be trapped and intimidated by moving elements. Think of them as the same with merging arrays into a new array.
//Another method(not verified) is if b has 1 and a has 2 at the beginning, exchange their position.
public class MergeSortedArray2 {
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        int index = n + m;

        while (m > 0 && n > 0) {
            if (A[m - 1] > B[n - 1]) {
                A[--index] = A[--m];
            } else {
                A[--index] = B[--n];
            }
        }
        while (n > 0) {
            A[--index] = B[--n];
        }
        while (m > 0) {
            A[--index] = A[--m];
        }
    }
}
