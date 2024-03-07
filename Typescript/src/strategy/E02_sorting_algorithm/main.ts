import { SortingClient } from "./client/SortingClient";
import { BubbleSort } from "./instances/BubbleSort";
import { InsertionSort } from "./instances/InsertionSort";
import { QuickSort } from "./instances/QuickSort";

function createArray(): number[] {
    return [99, 43, 54, 212, 53, 121.2, 4, 121.1];
}

const client = new SortingClient(new QuickSort);
const array: number[] = createArray();

console.table(array);
client.strategy = new InsertionSort;
client.strategy.sort(array);
console.table(array);
