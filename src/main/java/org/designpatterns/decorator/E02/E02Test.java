package org.designpatterns.decorator.E02;

import org.designpatterns.decorator.E02.contract.Printer;
import org.designpatterns.decorator.E02.contract.PrinterDecorator;
import org.designpatterns.decorator.E02.decorated.NumberPrinter;
import org.designpatterns.decorator.E02.decorator.AngleBracketsDecorator;
import org.designpatterns.decorator.E02.decorator.BracesDecorator;
import org.designpatterns.decorator.E02.decorator.ParenthesisDecorator;
import org.designpatterns.decorator.E02.decorator.SquareBracketsDecorator;

public class E02Test {
    public static void main(String[] args) {
        Printer printer = new NumberPrinter(1);
        final PrinterDecorator squareBracketsDecorator = new SquareBracketsDecorator(printer);
        final PrinterDecorator parenthesisDecorator = new ParenthesisDecorator(squareBracketsDecorator);
        final PrinterDecorator angleBracketsDecorator = new AngleBracketsDecorator(parenthesisDecorator);
        final PrinterDecorator bracesDecorator = new BracesDecorator(angleBracketsDecorator);
        System.out.println(bracesDecorator.print());
    }
}
