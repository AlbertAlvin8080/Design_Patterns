package org.designpatterns.factory.E03_log;

import org.designpatterns.factory.E03_log.factory_contract.LoggerFactory;
import org.designpatterns.factory.E03_log.factory_instance.ConsoleLoggerFactory;
import org.designpatterns.factory.E03_log.factory_instance.FileLoggerFactory;

import java.io.IOException;

public class E03Test {
    public static void main(String[] args) {
        if (args.length == 0)
            throw new RuntimeException("No args were passed");

        final LoggerFactory consoleLoggerFactory = new ConsoleLoggerFactory();
        final LoggerFactory fileLoggerFactory = new FileLoggerFactory();

        try {
            if (args[0].equals("console")) {
                consoleLoggerFactory.getLogger().log("infooooooooooooooooooooo");
            } else if(args[0].equals("file")) {
                fileLoggerFactory.getLogger().log("infooooooooooooooooooooo");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
