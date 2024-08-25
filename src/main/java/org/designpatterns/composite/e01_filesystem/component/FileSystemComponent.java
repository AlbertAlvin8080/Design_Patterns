package org.designpatterns.composite.e01_filesystem.component;

public abstract class FileSystemComponent
{
    public void print()
    {
        throw new UnsupportedOperationException();
    }

    public FileSystemComponent getChild(int n)
    {
        throw new UnsupportedOperationException();
    }

    public long getSizeKB()
    {
        throw new UnsupportedOperationException();
    }

    public String getName()
    {
        throw new UnsupportedOperationException();
    }

    public void addComponent(FileSystemComponent component)
    {
        throw new UnsupportedOperationException();
    }

    public void removeComponent(FileSystemComponent component)
    {
        throw new UnsupportedOperationException();
    }
}
