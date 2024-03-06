import { Alarm } from "../subject/Alarm";
import { Observer } from "../util/Observer";

export class InsuranceCompany implements Observer {
    propertyChange(source: Object): void {
        const alarm = source as Alarm;
        console.log(`Insurance Company: notified by ${alarm.name}.`);
    }
}