package org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizzamaker.instance;

import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.instance.PepperoniCalzone;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract.Calzone;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract.CalzoneType;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.instance.PepperoniPizza;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract.Pizza;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract.PizzaType;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizzamaker.contract.PizzaMaker;

import java.util.Objects;

public class EvenWeekDayPizzaMaker implements PizzaMaker {
    @Override
    public Pizza getPizza(PizzaType pizzaType) {
        if (Objects.requireNonNull(pizzaType) == PizzaType.PEPPERONI) {
            return new PepperoniPizza();
        }
        throw new RuntimeException("Invalid pizza type");
    }

    @Override
    public Calzone getCalzone(CalzoneType calzoneType) {
        if (Objects.requireNonNull(calzoneType) == CalzoneType.PEPPERONI) {
            return new PepperoniCalzone();
        }
        throw new RuntimeException("Invalid calzone type");
    }
}
