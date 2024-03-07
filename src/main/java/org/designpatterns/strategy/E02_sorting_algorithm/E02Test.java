package org.designpatterns.strategy.E02_sorting_algorithm;

import org.designpatterns.strategy.E02_sorting_algorithm.client.SorterClient;
import org.designpatterns.strategy.E02_sorting_algorithm.instances.BubbleSortInteger;
import org.designpatterns.strategy.E02_sorting_algorithm.instances.InsertionSortInteger;
import org.designpatterns.strategy.E02_sorting_algorithm.instances.MergeSortInteger;
import org.designpatterns.strategy.E02_sorting_algorithm.instances.QuickSortInteger;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class E02Test {
    public static void main(String[] args) {
        final SorterClient<Integer> client = new SorterClient<>(new BubbleSortInteger());
        final Integer[] bubbleSort = client.sort(getLocalRandomIntegerArray());
        System.out.printf("%-15s: %s%n", "Bubble Sort", Arrays.toString(bubbleSort));

        client.setStrategy(new InsertionSortInteger());
        final Integer[] insertionSort = client.sort(getLocalRandomIntegerArray());
        System.out.printf("%-15s: %s%n", "Insertion Sort", Arrays.toString(insertionSort));

        client.setStrategy(new MergeSortInteger());
        final Integer[] mergeSort = client.sort(getLocalRandomIntegerArray());
        System.out.printf("%-15s: %s%n", "Merge Sort", Arrays.toString(mergeSort));

        client.setStrategy(new QuickSortInteger());
        final Integer[] quickSort = client.sort(getLocalRandomIntegerArray());
        System.out.printf("%-15s: %s%n", "Quick Sort", Arrays.toString(quickSort));
    }

    private static Integer[] getLocalRandomIntegerArray() {
        final ThreadLocalRandom current = ThreadLocalRandom.current();

        int size = 10;
        Integer[] array = new Integer[size];

        for (int i = 0; i < size; ++i) {
            array[i] = current.nextInt(100, 1000);
        }

        return array;
    }
}
