package org.designpatterns.command.person_object.contract;

import org.designpatterns.command.person_object.instances.Person;

public interface PersonCommandI
{
    void execute(Person person);
}
