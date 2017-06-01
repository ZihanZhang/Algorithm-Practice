package Binary_Search;

import java.util.ArrayList;

/**
 * Created by ZihanZhang on 17/5/31.
 */
public class SearchForARange {
    public ArrayList<Integer> searchRange(ArrayList<Integer> A, int target) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int low, high;

        if (A.size() == 0) {
            result.add(-1);
            result.add(-1);
        }

        int start = 0;
        //don't forget -1!!!
        int end = A.size() - 1;
        int mid;

        while (start + 1 < end) {
            mid = start + (end - start) / 2;

            if (A.get(mid) == target) {
                start = A.get(mid);
            }
            else if (A.get(mid) < target) {
                start = A.get(mid);
            }
            else if (A.get(mid) > target) {
                end = A.get(mid);
            }
        }

        if (A.get(start) == target) {
            high = start;
        }
        else if (A.get(end) == target) {
            high = end;
        }
        else high = -1;

        start = 0;
        end = A.size() - 1;

        while (start + 1 < end) {
            mid = start + (end - start) / 2;

            if (A.get(mid) == target) {
                end = A.get(mid);
            }
            else if (A.get(mid) < target) {
                start = A.get(mid);
            }
            else if (A.get(mid) > target) {
                end = A.get(mid);
            }
        }

        if (A.get(start) == target) {
            low = start;
        }
        else if (A.get(end) == target) {
            low = end;
        }
        else low = -1;

        result.add(low);
        result.add(high);

        return result;
    }
}
