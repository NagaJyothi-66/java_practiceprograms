package jyothi;
import java.util.*;

class LRUCache {
    private final int capacity;
    private final Map<Integer, Integer> cache;
    private final LinkedHashMap<Integer, Integer> lruMap;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.lruMap = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }

    public int get(int key) {
        if (!lruMap.containsKey(key)) return -1;
        return lruMap.get(key);
    }

    public void put(int key, int value) {
        lruMap.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
        lru.put(1, 1);
        lru.put(2, 2);
        System.out.println(lru.get(1)); // returns 1
        lru.put(3, 3); // evicts key 2
        System.out.println(lru.get(2)); // returns -1 (not found)
        lru.put(4, 4); // evicts key 1
        System.out.println(lru.get(1)); // returns -1 (not found)
        System.out.println(lru.get(3)); // returns 3
        System.out.println(lru.get(4)); // returns 4
    }
}