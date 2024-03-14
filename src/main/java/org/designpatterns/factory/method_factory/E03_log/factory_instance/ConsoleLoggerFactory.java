package org.designpatterns.factory.method_factory.E03_log.factory_instance;

import org.designpatterns.factory.method_factory.E03_log.factory_contract.LoggerFactory;
import org.designpatterns.factory.method_factory.E03_log.logger.ConsoleLogger;
import org.designpatterns.factory.method_factory.E03_log.logger.Logger;

import java.io.IOException;

public class ConsoleLoggerFactory implements LoggerFactory {
    @Override
    public Logger getLogger() throws IOException {
        return new ConsoleLogger();
    }
}
