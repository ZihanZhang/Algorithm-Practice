package Binary_Search;

/**
 * Created by ZihanZhang on 17/5/31.
 */
public class BinarySearch {
    //bound problem is core stuff. If end and start are neighbors, it will stay in forever loop.
    //One solution is using start + 1 and end - 1.
    //Better solution is jumping out the loop when they are neighbors and check those 2 next.
    //Using start and end as label, they should be 0 to length - 1
    //When mid equals target, either end = mid or start = mid is ok
    public int binarySearch(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                end = mid;
            }
            else if (nums[mid] > target) {
                end = mid;
            }
            else if (nums[mid] < target) {
                start = mid;
            }
        }

        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }

        return -1;
    }
}
