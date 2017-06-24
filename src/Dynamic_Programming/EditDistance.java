package Dynamic_Programming;

/**
 * Created by ZihanZhang on 17/6/24.
 */
public class EditDistance {
    public int minDistance(String word1, String word2) {
        int[][] mind = new int[word1.length()][word2.length()];
        for (int i = 0; i < word1.length(); i++) {
            mind[i][0] = i;
        }
        for (int j = 0; j < word2.length(); j++) {
            mind[0][j] = j;
        }

        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                mind[i][j] = Math.max(mind[i - 1][j], mind[i][j - 1]) + 1;
            }
        }

        return mind[word1.length()][word2.length()];
    }
}
