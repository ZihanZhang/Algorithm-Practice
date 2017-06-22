package Dynamic_Programming;

/**
 * Created by ZihanZhang on 17/6/22.
 */
public class LongestIncreasingSequence {
    public int longestIncreasingSubsequence(int[] nums) {
        int[] longest = new int[nums.length];

        longest[0] = 0;

        for (int i = 0; i < nums.length; i++) {
            int longestn = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    if (nums[j] + 1 > longestn) {
                        longestn = nums[j] + 1;
                    }
                }
                else {
                    if (nums[j] > longestn) {
                        longestn = nums[j];
                    }
                }
            }
        }

        return longest[nums.length - 1];
    }
}
