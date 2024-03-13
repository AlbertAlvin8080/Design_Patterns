package org.designpatterns.factory.E03_log.logger;

import org.designpatterns.factory.E03_log.logger.Logger;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String info) {
        System.out.println(info);
    }
}
