package org.designpatterns.composite.e01_filesystem.composite;

import org.designpatterns.composite.e01_filesystem.component.FileSystemComponent;

import java.util.ArrayList;

public class FolderComposite extends FileSystemComponent
{
    private String name;
    private ArrayList<FileSystemComponent> nodes;

    public FolderComposite(String name, ArrayList<FileSystemComponent> nodes)
    {
        this.name = name;
        this.nodes = nodes;
    }

    @Override
    public void print()
    {
        System.out.println("=============== " + getName() + " ===============");
        System.out.println("Folder: true");
        System.out.println("Name: " + getName());
        System.out.println("Size (KB): " + getSizeKB());
        for (FileSystemComponent node : nodes)
        {
            node.print();
        }
        System.out.println("!=============== " + getName() + " ===============");
    }

    @Override
    public long getSizeKB()
    {
        long sizeSum = 0;

        for (FileSystemComponent node : nodes)
        {
            sizeSum += node.getSizeKB();
        }

        return sizeSum;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public FileSystemComponent getChild(int n)
    {
        if (n < 0 || n >= nodes.size())
            return null;
        return nodes.get(n);
    }

    @Override
    public void addComponent(FileSystemComponent component)
    {
        nodes.add(component);
    }

    @Override
    public void removeComponent(FileSystemComponent component)
    {
        nodes.remove(component);
    }

}
