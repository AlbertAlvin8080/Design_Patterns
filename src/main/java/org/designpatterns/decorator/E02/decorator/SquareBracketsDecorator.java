package org.designpatterns.decorator.E02.decorator;

import org.designpatterns.decorator.E02.contract.Printer;
import org.designpatterns.decorator.E02.contract.PrinterDecorator;

public class SquareBracketsDecorator extends PrinterDecorator {
    public SquareBracketsDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public String print() {
        return "[" + super.printer.print() + "]";
    }
}
