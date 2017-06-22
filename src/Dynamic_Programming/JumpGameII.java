package Dynamic_Programming;

/**
 * Created by ZihanZhang on 17/6/21.
 */
public class JumpGameII {
    public int jump(int[] A) {
        int[] jump = new int[A.length];

        jump[0] = 1;

        for (int i = 1; i < A.length; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 0; j < A.length; j++) {
                if (A[j] + j >= i) {
                    if (jump[j] + 1 < minn) {
                        minn = jump[j] + 1;
                    }
                }
            }
        }

        return jump[A.length - 1];
    }
}
