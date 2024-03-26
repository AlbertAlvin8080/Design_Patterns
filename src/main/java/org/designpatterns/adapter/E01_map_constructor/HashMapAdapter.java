package org.designpatterns.adapter.E01_map_constructor;

import java.util.*;
import java.util.function.BiConsumer;

public class HashMapAdapter<K, V> implements Map<K, V> {

//    private TreeMap<K, V> map;
    private HashMap<K, V> map;

    public HashMapAdapter(Object[][] matrix) {
        if (matrix.length != 2)
            throw new IllegalArgumentException("The matrix must have exactly two rows.");

        map = new HashMap<>();
        for(int i = 0; i < matrix[0].length && i < matrix[1].length; ++i) {
            map.put((K) matrix[0][i], (V) matrix[1][i]);
        }
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    @Override
    public V get(Object key) {
        return map.get(key);
    }

    @Override
    public V put(K key, V value) {
        return map.put(key, value);
    }

    @Override
    public V remove(Object key) {
        return map.remove(key);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        map.putAll(m);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Set<K> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<V> values() {
        return map.values();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return map.entrySet();
    }

    @Override
    public void forEach(BiConsumer<? super K, ? super V> action) {
        map.forEach(action);
    }
}
