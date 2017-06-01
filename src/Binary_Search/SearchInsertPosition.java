package Binary_Search;

/**
 * Created by ZihanZhang on 17/5/31.
 */

//Don't forget the two situation when there are many of the same value. Both sides have to be taken into consideration
public class SearchInsertPosition {
    public int searchInsert(int[] A, int target) {
        if (A.length == 0) {
            return 0;
        }

        int start = 0;
        int end = A.length;
        int mid;

        while (start + 1 < end) {
            mid = start + (end - start) / 2;

            if (A[mid] == target) {
                return mid;
// Assume no duplication no need for that                start = mid;
            }
            else if (A[mid] < target) {
                start = mid;
            }
            else if (A[mid] > target) {
                end = mid;
            }
        }

        if (target <= A[start]) {
            return start;
        }
        else if (target < A[end]) {
            return end;
        }
        else {
            return end + 1;
        }

// These are wrong! return can only be checked once
//        start = 0;
//        end = A.length;
//
//        while (start + 1 < end) {
//            mid = start + (end - start) / 2;
//
//            if (A[mid] == target) {
//                start = mid;
//            }
//            else if (A[mid] < target) {
//                start = mid;
//            }
//            else if (A[mid] > target) {
//                end = mid;
//            }
//        }
//
//        if (target > ) {
//
//        }
//These are wrong. It's starting position now. Ending bound should not be leveraged here
//        else {
//            return end + 1;
//        }
    }
}
