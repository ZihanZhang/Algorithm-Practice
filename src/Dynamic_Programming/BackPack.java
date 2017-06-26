package Dynamic_Programming;

/**
 * Created by ZihanZhang on 17/6/26.
 */
public class BackPack {
    public int backPack(int m, int[] A) {
        int[] full = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (full[i - 1] + A[i] <= m) {
                full[i] = full[i - 1] + A[i];
            }
            else {
                for (int j = 0; j < i; j++) {
                    if (full[j] + A[i] > full[i - 1] && full[j] + A[i] <= m) {
                        full[i] = full[j] + A[i];
                    }
                }
            }
        }

        return full[A.length];
    }
}
