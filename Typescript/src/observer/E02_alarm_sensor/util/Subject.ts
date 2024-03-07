import { Observer } from './Observer';

export class Subject {
    source: Object;
    observers: Observer[];

    constructor(newSource: Object, newObservers: Observer[] = []) {
        this.source = newSource;
        this.observers = newObservers;
    }

    public firePropertyChange() {
        this.observers.forEach((ob) => {
            ob.propertyChange(this.source);
        });
    }

    public addObserver(newObserver: Observer) {
        this.observers.push(newObserver);
    }

    public removeObserver(presentObserver: Observer) {
        this.observers = this.observers.filter((ob) => {
            return ob != presentObserver;
        });
    }
}