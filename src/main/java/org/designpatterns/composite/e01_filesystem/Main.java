package org.designpatterns.composite.e01_filesystem;

import org.designpatterns.composite.e01_filesystem.client.FileSystemClient;
import org.designpatterns.composite.e01_filesystem.component.FileSystemComponent;
import org.designpatterns.composite.e01_filesystem.composite.FolderComposite;
import org.designpatterns.composite.e01_filesystem.leaf.FileLeaf;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        final ArrayList<FileSystemComponent> nodes1 = new ArrayList<>(List.of(
                new FileLeaf("Main.java", 12),
                new FileLeaf("MyFrame.java", 300)
        ));

        final ArrayList<FileSystemComponent> nodes2 = new ArrayList<>(List.of(
                new FileLeaf("pom.xml", 10),
                new FileLeaf("Docker", 43),
                new FileLeaf("init.sql", 900),
                new FolderComposite("src", nodes1)
        ));

        final FolderComposite folderComposite = new FolderComposite("Swing-Project", nodes2);

        final FileSystemClient fileSystemClient = new FileSystemClient(folderComposite);
        fileSystemClient.print();
    }
}
