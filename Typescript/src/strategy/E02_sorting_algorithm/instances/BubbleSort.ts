import { SortStrategy } from '../contract/contracts';

export class BubbleSort implements SortStrategy {
    sort(array: number[]): void {
        const length = array.length;
        for (let i = 0; i < length; i++) {
            for (let j = 0; j < length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    const temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

