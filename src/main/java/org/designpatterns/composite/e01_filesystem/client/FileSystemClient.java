package org.designpatterns.composite.e01_filesystem.client;

import org.designpatterns.composite.e01_filesystem.component.FileSystemComponent;

public class FileSystemClient
{
    private FileSystemComponent allNodes;

    public FileSystemClient(FileSystemComponent allNodes)
    {
        this.allNodes = allNodes;
    }

    public void print()
    {
        allNodes.print();
    }
}
