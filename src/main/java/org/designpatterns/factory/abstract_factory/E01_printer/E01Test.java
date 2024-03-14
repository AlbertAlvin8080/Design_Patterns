package org.designpatterns.factory.abstract_factory.E01_printer;

import org.designpatterns.factory.abstract_factory.E01_printer.factory_contract.PrinterFactory;
import org.designpatterns.factory.abstract_factory.E01_printer.factory_instance.ConsolePrinterFactory;
import org.designpatterns.factory.abstract_factory.E01_printer.factory_instance.FilePrinterFactory;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class E01Test {
    public static void main(String[] args) throws IOException {
        final PrinterFactory filePrinterFactory = new FilePrinterFactory();
        final PrinterFactory consolePrinterFactory = new ConsolePrinterFactory();

        String message = "Hello, World!";
        final int i = ThreadLocalRandom.current().nextInt(0, 2);
        if(i == 0) {
            filePrinterFactory.getPrinter().print(message);
        } else if(i == 1) {
            consolePrinterFactory.getPrinter().print(message);
        }
    }
}
