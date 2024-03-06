package org.designpatterns.observer.E02_alarm_sensor.subject.alarm;

import org.designpatterns.observer.E02_alarm_sensor.subject.sensor.Sensor;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Alarm implements PropertyChangeListener {
    private PropertyChangeSupport support;

    public Alarm() {
        support = new PropertyChangeSupport(this);
    }

    public void firePropertyChange() {
        support.firePropertyChange(null, null, null);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        final Sensor sensor = (Sensor) evt.getSource();
        System.out.printf("ALARM: %s - ACTIVATED.%n", sensor.getSensorName());
        firePropertyChange();
    }
}
