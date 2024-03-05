package org.designpatterns.observer.E02_alarm_sensor.subject.sensor;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Sensor {
    private PropertyChangeSupport support;
    private String sensorName;

    public Sensor(String sensorName) {
        support = new PropertyChangeSupport(this);
        this.sensorName = sensorName;
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

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }
}
