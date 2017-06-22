package Dynamic_Programming;

/**
 * Created by ZihanZhang on 17/6/22.
 */
public class PalindromePartitioningII {
    private boolean isPalindrome(String subs) {
        for (int i = 0; i < subs.length() / 2; i++) {
            if (subs.charAt(i) != subs.charAt(subs.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public int minCut(String s) {
        int[] min = new int[s.length()];

        min[0] = 0;

        for (int i = 1; i < s.length(); i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 0; j < s.length(); j++) {
                if (isPalindrome(s.substring(j, i)) && min[j] + 1 < minn) {
                    minn = min[j] + 1;
                }
            }
        }

        return min[s.length()];
    }
}
