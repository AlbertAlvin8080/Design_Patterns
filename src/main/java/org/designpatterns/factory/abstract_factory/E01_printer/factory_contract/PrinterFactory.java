package org.designpatterns.factory.abstract_factory.E01_printer.factory_contract;

import org.designpatterns.factory.abstract_factory.E01_printer.model.Printer;

import java.io.IOException;

public interface PrinterFactory {
    Printer getPrinter() throws IOException;
}
