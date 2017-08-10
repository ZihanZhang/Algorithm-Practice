import java.util.HashMap;

/**
 * Created by ZihanZhang on 17/8/10.
 */
public class FindPassingPath {
    public boolean isCrossing(char[] dirs) {
        int x = 0, y = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < dirs.length; i++) {
            if (dirs[i] == 'E') {
                x++;

                if (hashMap.get(x) == y) {
                    return true;
                }
                hashMap.put(x, y);
            }
            if (dirs[i] == 'W') {
                x--;

                if (hashMap.get(x) == y) {
                    return true;
                }
                hashMap.put(x, y);
            }
            if (dirs[i] == 'S') {
                y--;

                if (hashMap.get(x) == y) {
                    return true;
                }
                hashMap.put(x, y);
            }
            if (dirs[i] == 'N') {
                y++;

                if (hashMap.get(x) == y) {
                    return true;
                }
                hashMap.put(x, y);
            }
        }

        return false;
    }
}
