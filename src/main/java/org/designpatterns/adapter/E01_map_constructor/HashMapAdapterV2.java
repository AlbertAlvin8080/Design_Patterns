package org.designpatterns.adapter.E01_map_constructor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapAdapterV2 {

//    private TreeMap<K, V> map;
    private HashMap<Object, Object> map;

    public HashMapAdapterV2(Object[][] matrix) {
        if (matrix.length != 2)
            throw new IllegalArgumentException("The matrix must have exactly two rows.");

        map = new HashMap<>();
        for(int i = 0; i < matrix[0].length && i < matrix[1].length; ++i) {
            map.put(matrix[0][i], matrix[1][i]);
        }
    }

    public Map<Object, Object> getMap() {
        return map;
    }
}
