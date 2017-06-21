package Dynamic_Programming;

import java.util.ArrayList;

/**
 * Created by ZihanZhang on 17/6/17.
 */
public class Triangle {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // 4 means length
        int[][] sum = new int[4][4];

        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0) {
                    sum[i][j] = triangle.get(i).get(j);
                }
                else {
                    sum[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        sum[0][0] = triangle.get(0).get(0);

        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 1; j <triangle.size(); j++) {
                if (sum[i][j] != Integer.MAX_VALUE) {
                    sum[i][j] = Math.min(sum[i][j - 1] + triangle.get(i).get(j), sum[i - 1][j - 1] + triangle.get(i).get(j));
                }
            }
        }

        int minsum = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            if (sum[i][3] < minsum) {
                minsum = sum[i][3];
            }
        }

        return minsum;
    }
}
