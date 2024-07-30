package org.designpatterns.observer.person_writer.observer;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.designpatterns.observer.person_writer.entity.Person;

import java.io.File;
import java.io.IOException;

public class CsvPersonWriterObserver extends PersonWriterObserver
{
    private final CsvMapper MAPPER = new CsvMapper();
    private final CsvSchema SCHEMA = MAPPER.schemaFor(Person.class).withHeader();

    @Override
    public void write(Person person)
    {
        try
        {
            MAPPER.writer(SCHEMA).writeValue(
                    new File("src/main/resources/observer/person_out.csv"),
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
        return "csv";
    }
}
