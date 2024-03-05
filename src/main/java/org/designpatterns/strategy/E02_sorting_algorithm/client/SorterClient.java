package org.designpatterns.strategy.E02_sorting_algorithm.client;

import org.designpatterns.strategy.E02_sorting_algorithm.contract.SortStrategy;

public class SorterClient <T> {
    private SortStrategy<T> strategy;

    public SorterClient(SortStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public T[] sort(T[] array) {
        return strategy.sort(array);
    }

    public SortStrategy<T> getStrategy() {
        return strategy;
    }

    public void setStrategy(SortStrategy<T> strategy) {
        this.strategy = strategy;
    }
}
