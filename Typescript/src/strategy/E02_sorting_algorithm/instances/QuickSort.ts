import { SortStrategy } from '../contract/contracts';

export class QuickSort implements SortStrategy {
    sort(array: number[]): void {
        this.quickSort(array, 0, array.length - 1);
    }

    private quickSort(array: number[], low: number, high: number): void {
        if (low < high) {
            const partitionIndex = this.partition(array, low, high);
            this.quickSort(array, low, partitionIndex - 1);
            this.quickSort(array, partitionIndex + 1, high);
        }
    }

    private partition(array: number[], low: number, high: number): number {
        const pivot = array[high];
        let i = low - 1;

        for (let j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                this.swap(array, i, j);
            }
        }

        this.swap(array, i + 1, high);
        return i + 1;
    }

    private swap(array: number[], i: number, j: number): void {
        const temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}