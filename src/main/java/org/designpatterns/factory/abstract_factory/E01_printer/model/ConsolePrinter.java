package org.designpatterns.factory.abstract_factory.E01_printer.model;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("--------------------------------");
        System.out.println(message);
        System.out.println("--------------------------------");
    }
}
