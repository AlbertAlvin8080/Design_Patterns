package org.designpatterns.factory.method_factory.E02_files.infoprovider;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PublicInfoProvider implements InfoProvider {
    @Override
    public String getInfo() {
        final Path path = Paths.get("./src/main/resources/method_factory/E02_files/public.txt");
        try (final BufferedReader br = Files.newBufferedReader(path))
        {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            return stringBuilder.toString();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
