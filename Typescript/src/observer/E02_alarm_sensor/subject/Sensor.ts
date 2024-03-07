import { Observer } from "../util/Observer";
import { Subject } from "../util/Subject";

export class Sensor {
    private subject: Subject = new Subject(this);

    constructor(readonly name: string) {}

    public firePropertyChange() {
        this.subject.firePropertyChange();
    }

    public addObserver(newObserver: Observer) {
        this.subject.addObserver(newObserver);
    }

    public removeObserver(presentObserver: Observer) {
        this.subject.removeObserver(presentObserver);
    }
}