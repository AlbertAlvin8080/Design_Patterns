package org.designpatterns.factory.E03_log.logger;

import org.designpatterns.factory.E03_log.logger.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    private final File file;

    public FileLogger() throws IOException {
        file = new File("./src/main/resources/factory_E03_logfiles/log.txt");
//        System.out.println(file.exists());
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    @Override
    public void log(String info) {
        try (
                FileWriter fileWriter = new FileWriter(file, true);
                final BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            bufferedWriter.append(info).append("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
