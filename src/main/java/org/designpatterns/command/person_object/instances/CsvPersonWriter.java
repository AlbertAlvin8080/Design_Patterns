package org.designpatterns.command.person_object.instances;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.designpatterns.command.person_object.contract.PersonCommandI;

import java.io.File;
import java.io.IOException;

public class CsvPersonWriter implements PersonCommandI
{
    private final CsvMapper MAPPER = new CsvMapper();
    private final CsvSchema SCHEMA = MAPPER.schemaFor(Person.class).withHeader();

    @Override
    public void execute(Person person)
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
