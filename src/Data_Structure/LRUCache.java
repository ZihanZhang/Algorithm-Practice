package Data_Structure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ZihanZhang on 17/6/24.
 */
public class LRUCache {
    HashMap<Integer, Integer> cache;
    Queue<Integer> queue;
    int capacity;

    // @param capacity, an integer
    public LRUCache(int capacity) {
        cache = new HashMap<Integer, Integer>(capacity);
        queue = new LinkedList<Integer>();
        this.capacity = capacity;
    }

    // @return an integer
    public int get(int key) {
        return cache.get(key);
    }

    // @param key, an integer
    // @param value, an integer
    // @return nothing
    public void set(int key, int value) {
        if (cache.size() < capacity) {
            cache.put(key, value);
            queue.add(key);
        }
        else {
            queue.add(key);
            int oldkey = queue.poll();
            cache.remove(oldkey);
            cache.put(key, value);
        }
    }
}
