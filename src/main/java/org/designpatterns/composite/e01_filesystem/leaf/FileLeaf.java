package org.designpatterns.composite.e01_filesystem.leaf;

import org.designpatterns.composite.e01_filesystem.component.FileSystemComponent;

public class FileLeaf extends FileSystemComponent
{
    private String name;
    private long size;

    public FileLeaf(String name, long size)
    {
        this.name = name;
        this.size = size;
    }

    @Override
    public void print()
    {
        System.out.println("-----------------------------------------------------");
        System.out.println("Folder: false");
        System.out.println("Name: " + getName());
        System.out.println("Size (KB): " + getSizeKB());
    }

    @Override
    public long getSizeKB()
    {
        return size;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
