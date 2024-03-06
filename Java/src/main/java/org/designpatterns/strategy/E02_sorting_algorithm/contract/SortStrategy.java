package org.designpatterns.strategy.E02_sorting_algorithm.contract;

@FunctionalInterface
public interface SortStrategy<T> {
    T[] sort(T[] array);
}
