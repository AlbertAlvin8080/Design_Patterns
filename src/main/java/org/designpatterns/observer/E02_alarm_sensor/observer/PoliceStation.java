package org.designpatterns.observer.E02_alarm_sensor.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PoliceStation implements PropertyChangeListener {
    private String name;

    public PoliceStation(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
//        final Alarm alarm = (Alarm) evt.getSource();
//        System.out.println(evt.getPropertyName());
        System.out.printf("POLICE STATION '%s': NOTIFIED.%n", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
