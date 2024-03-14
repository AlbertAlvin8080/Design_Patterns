package org.designpatterns.factory.abstract_factory.E02_pizzaria.factory_instance;

import org.designpatterns.factory.abstract_factory.E02_pizzaria.factory_contract.PizzeriaFactory;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract.Calzone;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract.CalzoneType;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract.Pizza;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract.PizzaType;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizzamaker.instance.EvenWeekDayPizzaMaker;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizzamaker.instance.OddWeekDayPizzaMaker;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizzamaker.contract.PizzaMaker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TwoGuysPizzeriaFactory implements PizzeriaFactory {
    private Calendar calendar;
    private SimpleDateFormat simpleDateFormat;

    public TwoGuysPizzeriaFactory() {
        calendar = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    }

    @Override
    public PizzaMaker getPizzaMaker(String strDate) throws ParseException {
        final Date date = simpleDateFormat.parse(strDate);
        calendar.setTime(date);

        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                throw new RuntimeException("Pizzeria is closed at sundays.");
            case Calendar.MONDAY:
            case Calendar.WEDNESDAY:
            case Calendar.FRIDAY:
                return new EvenWeekDayPizzaMaker();
            case Calendar.TUESDAY:
            case Calendar.THURSDAY:
            case Calendar.SATURDAY:
                return new OddWeekDayPizzaMaker();
            default:
                throw new RuntimeException("Invalid day of week.");
        }
    }

    @Override
    public Pizza getPizza(PizzaMaker pizzaMaker, PizzaType pizzaType) {
        return pizzaMaker.getPizza(pizzaType);
    }

    @Override
    public Calzone getCalzone(PizzaMaker pizzaMaker, CalzoneType calzoneType) {
        return pizzaMaker.getCalzone(calzoneType);
    }
}
