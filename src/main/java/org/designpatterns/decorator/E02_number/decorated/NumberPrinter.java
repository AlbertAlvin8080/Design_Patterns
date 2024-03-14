package org.designpatterns.decorator.E02_number.decorated;

import org.designpatterns.decorator.E02_number.contract.Printer;

public class NumberPrinter implements Printer {
    private int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public String print() {
        return String.valueOf(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
