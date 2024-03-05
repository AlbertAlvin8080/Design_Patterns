package org.designpatterns.observer.E02_alarm_sensor.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class InsuranceCompany implements PropertyChangeListener {
    private String name;

    public InsuranceCompany(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.printf("INSURANCE COMPANY '%s': NOTIFIED.%n", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
