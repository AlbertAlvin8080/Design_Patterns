package org.designpatterns.command.person_object.instances;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.designpatterns.command.person_object.contract.PersonCommandI;

import java.io.File;
import java.io.IOException;

public class XmlPersonWriter implements PersonCommandI
{
    private static XmlMapper MAPPER = new XmlMapper();
    private Person person;


    public void setPerson(Person person)
    {
        this.person = person;
    }

    @Override
    public void execute()
    {
        try
        {
            MAPPER.writerWithDefaultPrettyPrinter()
                    .writeValue(
                            new File("src/main/resources/command/person_out.xml"),
                            person
                    );
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
