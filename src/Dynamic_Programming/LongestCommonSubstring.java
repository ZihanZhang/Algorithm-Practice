package Dynamic_Programming;

/**
 * Created by ZihanZhang on 17/6/24.
 */
public class LongestCommonSubstring {
    public int longestCommonSubstring(String A, String B) {
        int[][] lcs = new int[A.length()][B.length()];
        for (int i = 0; i < A.length(); i++) {
            lcs[i][0] = 0;
        }
        for (int i = 0; i < B.length(); i++) {
            lcs[0][i] = 0;
        }

        for (int i = 1; i < A.length(); i++) {
            for (int j = 1; j < B.length(); j++) {
                if (A.charAt(i) == B.charAt(j)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                }
                else {
                    lcs[i][j] = 0;
                }
            }
        }

        int lcsn = Integer.MIN_VALUE;

        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                if (lcs[i][j] > lcsn) {
                    lcsn = lcs[i][j];
                }
            }
        }

        return lcsn;
    }
}
