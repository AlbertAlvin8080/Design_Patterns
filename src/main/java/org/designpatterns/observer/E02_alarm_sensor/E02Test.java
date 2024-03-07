package org.designpatterns.observer.E02_alarm_sensor;

import org.designpatterns.observer.E02_alarm_sensor.observer.InsuranceCompany;
import org.designpatterns.observer.E02_alarm_sensor.observer.PoliceStation;
import org.designpatterns.observer.E02_alarm_sensor.subject.alarm.Alarm;
import org.designpatterns.observer.E02_alarm_sensor.subject.sensor.Sensor;

public class E02Test {
    public static void main(String[] args) {
        final Sensor sensorBlockA = new Sensor("Sensor Block A");
        final Sensor sensorBlockB = new Sensor("Sensor Block B");
        final Sensor sensorBlockC = new Sensor("Sensor Block C");

        final Alarm alarm = new Alarm();
        alarm.addPropertyChangeListener(new PoliceStation("Police S. 1"));
        alarm.addPropertyChangeListener(new InsuranceCompany("Insurance C. 1"));

        sensorBlockA.addPropertyChangeListener(alarm);
        sensorBlockB.addPropertyChangeListener(alarm);
        sensorBlockC.addPropertyChangeListener(alarm);

        sensorBlockB.firePropertyChange();
        System.out.println("-----------------------------------------------");
        sensorBlockA.firePropertyChange();
    }
}
