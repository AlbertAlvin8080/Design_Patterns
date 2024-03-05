package org.designpatterns.strategy.E02_sorting_algorithm.instances;

import org.designpatterns.strategy.E02_sorting_algorithm.contract.SortStrategy;

public class InsertionSortInteger implements SortStrategy<Integer> {
    @Override
    public Integer[] sort(Integer[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            Integer key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }
}
