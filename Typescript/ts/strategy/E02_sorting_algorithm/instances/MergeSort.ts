import { SortStrategy } from '../contract/contracts';

export class MergeSort implements SortStrategy {
    sort(array: number[]): void {
        this.mergeSort(array, 0, array.length - 1);
    }

    private mergeSort(array: number[], left: number, right: number): void {
        if (left < right) {
            const mid = Math.floor((left + right) / 2);
            this.mergeSort(array, left, mid);
            this.mergeSort(array, mid + 1, right);
            this.merge(array, left, mid, right);
        }
    }

    private merge(array: number[], left: number, mid: number, right: number): void {
        const leftSize = mid - left + 1;
        const rightSize = right - mid;
        const leftArray = new Array(leftSize);
        const rightArray = new Array(rightSize);

        for (let i = 0; i < leftSize; i++) {
            leftArray[i] = array[left + i];
        }
        for (let j = 0; j < rightSize; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        let i = 0, j = 0, k = left;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}