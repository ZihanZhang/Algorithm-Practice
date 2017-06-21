package Dynamic_Programming;

/**
 * Created by ZihanZhang on 17/6/21.
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] minsum = new int[grid.length][grid[0].length];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    minsum[i][j] = grid[i][j];
                }
                if (j == 0) {
                    minsum[i][j] = grid[i][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                minsum[i][j] = Math.min(minsum[i][j - 1], minsum[i - 1][j]) + grid[i][j];
            }
        }

        return minsum[m][n];
    }
}
