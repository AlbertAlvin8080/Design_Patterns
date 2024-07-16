package org.designpatterns.command.person_object.invoker;

import org.designpatterns.command.person_object.contract.PersonCommandI;
import org.designpatterns.command.person_object.instances.Person;

import java.util.Map;

public class InvokerPersonSerializer
{
    private final Map<String, PersonCommandI> map;

    public InvokerPersonSerializer(Map<String, PersonCommandI> map)
    {
        this.map = map;
    }

    public void addCommand(String type, PersonCommandI personCommandI)
    {
        map.put(type, personCommandI);
    }

    public void executeCommand(String format, Person person)
    {
        final PersonCommandI personCommandI = map.get(format);
        if (personCommandI == null)
            throw new IllegalArgumentException("The provided key does not have any command.");

        personCommandI.execute(person);
    }

    public void executeAllCommands(Person person)
    {
        map.forEach((k, v) -> v.execute(person));
    }
}
