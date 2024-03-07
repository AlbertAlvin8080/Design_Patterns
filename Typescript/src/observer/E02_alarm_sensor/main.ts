import { InsuranceCompany } from "./observer/InsuranceCompany";
import { PoliceStation } from "./observer/PoliceStation";
import { Alarm } from "./subject/Alarm";
import { Sensor } from "./subject/Sensor";

const alarm = new Alarm("MY_ALARM");

alarm.addObserver(new PoliceStation);
alarm.addObserver(new PoliceStation);
alarm.addObserver(new PoliceStation);
alarm.addObserver(new PoliceStation);
alarm.addObserver(new PoliceStation);
alarm.addObserver(new InsuranceCompany);

const company = new InsuranceCompany;
alarm.addObserver(company);
alarm.removeObserver(company);

const sensorA = new Sensor("Sensor Block A");
const sensorB = new Sensor("Sensor Block B");
const sensorC = new Sensor("Sensor Block C");

sensorB.addObserver(alarm);
sensorB.firePropertyChange();
console.log();
sensorC.addObserver(alarm);
sensorC.firePropertyChange();
