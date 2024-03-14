package org.designpatterns.factory.abstract_factory.E01_printer.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {
    private File file;

    public FilePrinter(String fileName) throws IOException {
        file = new File("src/main/resources/abstract_factory/E01_printer/" + fileName);
        if(!file.exists())
            file.createNewFile();
    }

    @Override
    public void print(String message) {
        try (
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            bufferedWriter.write("-----------------------------------\n");
            bufferedWriter.write(message);
            bufferedWriter.write("\n-----------------------------------\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
