package org.designpatterns.command.person_object.instances;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.designpatterns.command.person_object.contract.PersonCommandI;

import java.io.File;
import java.io.IOException;

public class CsvPersonWriter implements PersonCommandI
{
    private static CsvMapper MAPPER = new CsvMapper();
    private static CsvSchema SCHEMA = MAPPER.schemaFor(Person.class).withHeader();
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
            MAPPER.writer(SCHEMA).writeValue(
                    new File("src/main/resources/command/person_out.csv"),
                    person
            );
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
