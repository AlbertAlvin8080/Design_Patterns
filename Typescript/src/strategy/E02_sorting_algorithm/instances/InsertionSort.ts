import { SortStrategy } from "../contract/contracts";

export class InsertionSort implements SortStrategy {
    sort(array: number[]): void {
        const length = array.length;
        for (let i = 1; i < length; i++) {
            const current = array[i];
            let j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = current;
        }
    }
}