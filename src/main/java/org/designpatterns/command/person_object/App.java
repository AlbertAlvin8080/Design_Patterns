package org.designpatterns.command.person_object;

import org.designpatterns.command.person_object.contract.PersonCommandI;
import org.designpatterns.command.person_object.instances.CsvPersonWriter;
import org.designpatterns.command.person_object.instances.JsonPersonWriter;
import org.designpatterns.command.person_object.instances.Person;
import org.designpatterns.command.person_object.instances.XmlPersonWriter;
import org.designpatterns.command.person_object.invoker.InvokerPersonSerializer;

import java.util.Map;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
//        final Person person = new Person("Franz", 43);
        final JsonPersonWriter jsonPersonWriter = new JsonPersonWriter();
        final CsvPersonWriter csvPersonWriter = new CsvPersonWriter();
        final XmlPersonWriter xmlPersonWriter = new XmlPersonWriter();

        final Map<String, PersonCommandI> map = Map.of(
                "json", jsonPersonWriter,
                "xml", xmlPersonWriter,
                "csv", csvPersonWriter
        );

        final InvokerPersonSerializer invokerPersonSerializer =
                new InvokerPersonSerializer(map);

//        invokerPersonSerializer.executeCommand("json", person);
//        invokerPersonSerializer.executeCommand("xml", person);
//        invokerPersonSerializer.executeCommand("csv", person);
//        invokerPersonSerializer.executeAllCommands(person);

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a name for the person:");
        final String name = sc.next();
        sc.nextLine();

        System.out.println("Provide an age for the person:");
        final int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Now the format for persisting the person (json, xml or csv):");
        final String format = sc.next().toLowerCase();
        sc.nextLine();

        invokerPersonSerializer.executeCommand(format, new Person(name, age));
    }
}
