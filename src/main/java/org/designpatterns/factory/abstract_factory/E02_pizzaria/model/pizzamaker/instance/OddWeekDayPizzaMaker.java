package org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizzamaker.instance;

import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.instance.HamCalzone;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract.Calzone;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract.CalzoneType;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.instance.HamPizza;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract.Pizza;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract.PizzaType;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizzamaker.contract.PizzaMaker;

import java.util.Objects;

public class OddWeekDayPizzaMaker implements PizzaMaker {
    @Override
    public Pizza getPizza(PizzaType pizzaType) {
        if (Objects.requireNonNull(pizzaType) == PizzaType.HAM) {
            return new HamPizza();
        }
        throw new RuntimeException("Invalid pizza type");
    }

    @Override
    public Calzone getCalzone(CalzoneType calzoneType) {
        if (Objects.requireNonNull(calzoneType) == CalzoneType.HAM) {
            return new HamCalzone();
        }
        throw new RuntimeException("Invalid calzone type");
    }
}
