import { Observer } from "../util/Observer";
import { Subject } from "../util/Subject";
import { Sensor } from "./Sensor";

export class Alarm implements Observer{
    private subject: Subject = new Subject(this);
    readonly name: string;

    constructor(name: string) {
        this.name = name;
    }

    propertyChange(source: Object): void {
        const sensor = source as Sensor;
        console.log(`${this.name}: notified by ${sensor.name}`);
        console.log("----------------------------------");
        this.firePropertyChange();
    }

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