package org.designpatterns.strategy.E02_sorting_algorithm.instances;

import org.designpatterns.strategy.E02_sorting_algorithm.contract.SortStrategy;

public class BubbleSortInteger implements SortStrategy<Integer> {
    @Override
    public Integer[] sort(Integer[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return array;
    }
}
