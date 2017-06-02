package Binary_Search;

/**
 * Created by ZihanZhang on 17/6/2.
 */

//Sorted stuff can be solved by binary search. Even in this scenario, whole array is divided into two part. First is one kind and second is another.
public class FirstBadVersion {
    public int findFirstBadVersion(int n) {
        int start = 0;
        int end = n;
        int mid;

        while (start + 1 < end) {
            mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                end = mid;
            }
            else {
                start = mid;
            }
        }

        if (isBadVersion(start)) {
            return start;
        }
        else {
            return end;
        }
    }

    public boolean isBadVersion(int n) {
        if (n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
