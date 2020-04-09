package lru;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Mahedi Hassan
 * 2020-03-31
 */

public class LRUCache<K, V> {
    private Map<K, V> map;
    public LRUCache(int cacheSize){
        map = new LinkedHashMap<K, V>(16,0.75f){
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > cacheSize;
            }
        };
    }

    public void put(K key, V value){
        map.put(key, value);
    }
    public V get(K key){
        return map.get(key);
    }

    public static void main(String[] s){
        LRUCache<Integer, Integer> lruCache = new LRUCache(3);
        lruCache.put(1, 1);
        lruCache.put(3, 3);
        lruCache.put(5, 5);
        lruCache.put(2, 5);

        System.out.println(lruCache.get(1)); // Should be null
        System.out.println(lruCache.get(3));

        Iterator it = lruCache.map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry tmpMap = (Map.Entry) it.next();
            System.out.println(tmpMap.getValue());
        }
    }
}
