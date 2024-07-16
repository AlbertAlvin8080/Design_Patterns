package org.designpatterns.command.person_object.instances;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.designpatterns.command.person_object.contract.PersonCommandI;

import java.io.File;
import java.io.IOException;

public class JsonPersonWriter implements PersonCommandI
{
    private final ObjectMapper MAPPER = new ObjectMapper();
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
                            new File("src/main/resources/command/person_out.json"),
                            person
                    );
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
