package org.designpatterns.factory.method_factory.E03_log.logger;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String info) {
        System.out.println(info);
    }
}
