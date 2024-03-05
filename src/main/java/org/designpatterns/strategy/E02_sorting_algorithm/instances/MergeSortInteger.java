package org.designpatterns.strategy.E02_sorting_algorithm.instances;

import org.designpatterns.strategy.E02_sorting_algorithm.contract.SortStrategy;

public class MergeSortInteger implements SortStrategy<Integer> {
    @Override
    public Integer[] sort(Integer[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        Integer[] left = new Integer[mid];
        Integer[] right = new Integer[array.length - mid];
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    private Integer[] merge(Integer[] left, Integer[] right) {
        Integer[] merged = new Integer[left.length + right.length];
        int leftIndex = 0, rightIndex = 0, mergedIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                merged[mergedIndex++] = left[leftIndex++];
            } else {
                merged[mergedIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            merged[mergedIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            merged[mergedIndex++] = right[rightIndex++];
        }

        return merged;
    }
}
