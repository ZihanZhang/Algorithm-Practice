package Dynamic_Programming;

/**
 * Created by ZihanZhang on 17/6/26.
 */
//Remember states before can be used to infer present state

//WRONG!
//The answer can be in the arrays
public class BackPack {
    public int backPack(int m, int[] A) {
        int[] full = new int[A.length];
        full[0] = A[0];

        for (int i = 1; i < A.length; i++) {
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

        return full[A.length - 1];
    }
}
