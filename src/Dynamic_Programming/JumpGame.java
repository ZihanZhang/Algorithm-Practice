package Dynamic_Programming;

/**
 * Created by ZihanZhang on 17/6/21.
 */
public class JumpGame {
    public boolean canJump(int[] A) {
        boolean[] can = new boolean[A.length];

    loop:   for (int i = 1; i < A.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (A[j] + j > i) {
                        can[i] = true;
                        break loop;
                    }
                }
                can[i] = false;
            }

        return can[A.length - 1];
    }
}
