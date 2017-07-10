package Dynamic_Programming;

/**
 * Created by ZihanZhang on 17/7/10.
 */
public class kSum {
    public int kSum(int A[], int k, int target) {
        int[][][] solution = new int[A.length][A.length][target];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                for (int e = 0; e < target; e++) {
                    solution[i][j][e] = solution[i - 1][j - 1][e - A[i]] + solution[i - 1][j][e];
                }
            }
        }

        return solution[A.length - 1][k][target];
    }
}
