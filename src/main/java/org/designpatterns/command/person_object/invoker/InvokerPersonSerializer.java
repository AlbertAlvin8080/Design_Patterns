package org.designpatterns.command.person_object.invoker;

import org.designpatterns.command.person_object.contract.PersonCommandI;

import java.util.ArrayList;
import java.util.List;

public class InvokerPersonSerializer
{
    private final List<PersonCommandI> commandList;

    public InvokerPersonSerializer()
    {
        this.commandList = new ArrayList<>();
    }

    public void addCommand(PersonCommandI commandI)
    {
        commandList.add(commandI);
    }

    public void removeCommand(int idx)
    {
        if (idx >= 0 && idx < commandList.size())
        {
            commandList.remove(idx);
            return;
        }
        throw new IndexOutOfBoundsException("Invalid index for command list.");
    }

    public void executeCommand(int idx)
    {
        if (idx >= 0 && idx < commandList.size())
        {
            commandList.get(idx).execute();
            return;
        }
        throw new IndexOutOfBoundsException("Invalid index for command list.");
    }
}
