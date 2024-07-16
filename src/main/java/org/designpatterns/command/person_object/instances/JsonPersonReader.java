package org.designpatterns.command.person_object.instances;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.designpatterns.command.person_object.contract.PersonCommandI;

import java.io.File;
import java.io.IOException;

public class JsonPersonReader implements PersonCommandI
{
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void execute()
    {
        try
        {
            final JsonNode jsonNode = objectMapper.readTree(
                    new File("src/main/resources/command/person.json")
            );
            System.out.println(new Person(
                    jsonNode.get("Name").asText(),
                    jsonNode.get("Age").asInt()
            ));
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
