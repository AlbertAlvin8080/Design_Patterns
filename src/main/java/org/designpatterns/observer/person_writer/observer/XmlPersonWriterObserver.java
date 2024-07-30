package org.designpatterns.observer.person_writer.observer;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

import org.designpatterns.observer.person_writer.entity.Person;

public class XmlPersonWriterObserver extends PersonWriterObserver
{
    private final XmlMapper MAPPER = new XmlMapper();

    @Override
    public void write(Person person)
    {
        try
        {
            MAPPER.writerWithDefaultPrettyPrinter()
                    .writeValue(
                            new File("src/main/resources/observer/person_out.xml"),
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
        return "xml";
    }
}
