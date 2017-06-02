package Binary_Search;

/**
 * Created by ZihanZhang on 17/6/2.
 */

//In this scenario, no rules are found. But in general, there is a rise and a fall which is a generic rule.
//And this can be solved by binary search.
public class FindPeakElement {
    public int findPeak(int[] A) {
        int start = 0;
        int end = A.length;
        int mid;

        while (start + 1 < end) {
            mid = start + (end - start) / 2;

            //No adjacent numbers are the same value
            if (A[mid - 1] < A[mid] && A[mid] > A[mid + 1]) {
                return mid;
            }
            else if (A[mid - 1] < A[mid] && A[mid] < A[mid + 1]) {
                start = mid;
            }
            else if (A[mid - 1] > A[mid] && A[mid] > A[mid + 1]) {
                end = mid;
            }
            else if (A[mid - 1] > A[mid] && A[mid] < A[mid + 1]) {
                start = mid;
            }
        }

        if (A[start - 1] < A[start] && A[start] > A[start + 1]) {
            return start;
        }
        else {
            return end;
        }
    }
}
