import { SortStrategy } from '../contract/contracts';

export class SortingClient {
    // looks like member initializer list in C++
    constructor(
        public strategy: SortStrategy
    ) {}
}