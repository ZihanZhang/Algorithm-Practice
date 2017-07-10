package Dynamic_Programming;

/**
 * Created by ZihanZhang on 17/7/10.
 */

public class BackPackII {
    public int backPackII(int m, int[] A, int V[]) {
        int[][] maxValue = new int[A.length][m];

        //Initialization

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < m; j++) {
                if (maxValue[i - 1][j] > maxValue[i - 1][j - A[j]] + V[i]) {
                    maxValue[i][j] = maxValue[i - 1][j];
                }
                else {
                    maxValue[i][j] = maxValue[i - 1][j - A[j]] + V[i];
                }
            }
        }

        return maxValue[A.length][m];
    }
}
