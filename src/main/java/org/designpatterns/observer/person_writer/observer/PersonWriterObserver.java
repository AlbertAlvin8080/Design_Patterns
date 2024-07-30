package org.designpatterns.observer.person_writer.observer;

import org.designpatterns.observer.person_writer.entity.Person;

public abstract class PersonWriterObserver
{
    public abstract void write(Person person);
    @Override
    public abstract String toString();
}
