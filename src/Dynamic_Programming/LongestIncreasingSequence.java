package Dynamic_Programming;

/**
 * Created by ZihanZhang on 17/6/22.
 */
// DP's result may not be exact one of the results of particles.
// But you should be sure that you can infer from previous results to present result(If using state as
// lis of sequence now, you cannot infer to present result. Instead, using lis ending with this state)
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

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (longest[i] > result) {
                result = longest[i];
            }
        }

        return result;
    }
}
