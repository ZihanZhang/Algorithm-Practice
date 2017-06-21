package Dynamic_Programming;

/**
 * Created by ZihanZhang on 17/6/21.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] steps = new int[n];
        steps[0] = 1;
        steps[1] = 2;

        for (int i = 2; i < n; i++) {
            steps[i] = Math.min(steps[i - 2] + 1, steps[i - 1] + 1);
        }

        return steps[n - 1];
    }
}
