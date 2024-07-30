package org.designpatterns.observer.person_writer.observer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.designpatterns.observer.person_writer.entity.Person;

import java.io.File;
import java.io.IOException;

public class JsonPersonWriterObserver extends PersonWriterObserver
{
    private final ObjectMapper MAPPER = new ObjectMapper();

    @Override
    public void write(Person person)
    {
        try
        {
            MAPPER.writerWithDefaultPrettyPrinter()
                    .writeValue(
                            new File("src/main/resources/observer/person_out.json"),
                            person
                    );
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString()
    {
        return "json";
    }
}
