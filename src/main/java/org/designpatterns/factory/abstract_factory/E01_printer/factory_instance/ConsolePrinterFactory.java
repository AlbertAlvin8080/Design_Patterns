package org.designpatterns.factory.abstract_factory.E01_printer.factory_instance;

import org.designpatterns.factory.abstract_factory.E01_printer.factory_contract.PrinterFactory;
import org.designpatterns.factory.abstract_factory.E01_printer.model.ConsolePrinter;
import org.designpatterns.factory.abstract_factory.E01_printer.model.Printer;

import java.io.IOException;

public class ConsolePrinterFactory implements PrinterFactory {
    @Override
    public Printer getPrinter() throws IOException {
        return new ConsolePrinter();
    }
}
