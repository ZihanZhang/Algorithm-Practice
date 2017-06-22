package Dynamic_Programming;

import java.util.Set;

/**
 * Created by ZihanZhang on 17/6/22.
 */
public class WordSegmentation {
    public boolean wordSegmentation(String s, Set<String> wordDict) {
        boolean [] can = new boolean[s.length()];

        can[0] = true;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (can[j] && wordDict.contains(s.substring(j + 1, i))) {
                    can[i] = true;
                    break;
                }
            }
        }

        return can[s.length() - 1];
    }
}
