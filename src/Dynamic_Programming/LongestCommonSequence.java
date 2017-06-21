package Dynamic_Programming;

/**
 * Created by ZihanZhang on 17/6/21.
 */
public class LongestCommonSequence {
    public int longestCommonSubsequence(String A, String B) {
        int[][] lcs = new int[A.length()][B.length()];

        for (int i = 0; i < A.length(); i++) {
            lcs[i][0] = 0;
            lcs[0][i] = 0;
        }

        for (int i = 1; i < A.length(); i++) {
            for (int j = 1; j < B.length(); j++) {
                if (B.charAt(j) == A.charAt(i)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                }
                else {
                    lcs[i][j] = Math.max(lcs[i][j - 1], lcs[i - 1][j]);
                }
            }
        }

        return lcs[A.length()][B.length()];
    }
}
