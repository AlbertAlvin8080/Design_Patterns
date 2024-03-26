package org.designpatterns.adapter.E01_map_constructor;

import java.util.Map;

public class E01Test02 {
    public static void main(String[] args) {
        System.out.println();
        Object[][] matrix = { { "One", "Two", "Three" }, { 1, 2, 3 } };

        final Map<Object, Object> adapted = new HashMapAdapterV2(matrix).getMap();

        adapted.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
