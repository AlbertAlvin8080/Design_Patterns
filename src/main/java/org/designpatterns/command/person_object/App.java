package org.designpatterns.command.person_object;

import org.designpatterns.command.person_object.instances.CsvPersonWriter;
import org.designpatterns.command.person_object.instances.JsonPersonWriter;
import org.designpatterns.command.person_object.instances.Person;
import org.designpatterns.command.person_object.instances.XmlPersonWriter;
import org.designpatterns.command.person_object.invoker.InvokerPersonSerializer;

public class App
{
    public static void main(String[] args)
    {
        final JsonPersonWriter jsonPersonWriter = new JsonPersonWriter();
        jsonPersonWriter.setPerson(new Person("Franz", 43));
        final CsvPersonWriter csvPersonWriter = new CsvPersonWriter();
        csvPersonWriter.setPerson(new Person("Emil", 43));
        final XmlPersonWriter xmlPersonWriter = new XmlPersonWriter();
        xmlPersonWriter.setPerson(new Person("Klaus", 43));

        final InvokerPersonSerializer invokerPersonSerializer =
                new InvokerPersonSerializer();
        invokerPersonSerializer.addCommand(jsonPersonWriter);
        invokerPersonSerializer.addCommand(csvPersonWriter);
        invokerPersonSerializer.addCommand(xmlPersonWriter);

        invokerPersonSerializer.executeCommand(0);
        invokerPersonSerializer.executeCommand(1);
        invokerPersonSerializer.executeCommand(2);
    }
}
