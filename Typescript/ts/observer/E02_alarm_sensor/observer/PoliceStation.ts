import { Alarm } from "../subject/Alarm";
import { Observer } from "../util/Observer";

export class PoliceStation implements Observer {
    propertyChange(source: Object): void {
        const alarm = source as Alarm;
        console.log(`Police Station: notified by ${alarm.name}.`);
    }
}