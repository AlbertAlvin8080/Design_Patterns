package org.designpatterns.decorator.E02_number.decorator;

import org.designpatterns.decorator.E02_number.contract.Printer;
import org.designpatterns.decorator.E02_number.contract.PrinterDecorator;

public class BracesDecorator extends PrinterDecorator {
    public BracesDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public String print() {
        return "{" + super.printer.print() + "}";
    }
}
