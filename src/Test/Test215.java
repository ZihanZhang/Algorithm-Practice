package Test;

import java.util.Arrays;

/**
 * Created by ZihanZhang on 17/9/1.
 */
public class Test215 {
    public static void main(String[] args) {
        int[] test = new int[2];

        test[0] = 2;
        test[1] = 1;

        Arrays.sort(test);
        System.out.println(test[0]);

        System.out.println(test[1]);

    }
}
