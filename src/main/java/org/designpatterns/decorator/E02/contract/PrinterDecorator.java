package org.designpatterns.decorator.E02.contract;

public abstract class PrinterDecorator implements Printer {
    protected Printer printer;

    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }
}
