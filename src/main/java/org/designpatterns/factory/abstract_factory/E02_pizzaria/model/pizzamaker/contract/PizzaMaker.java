package org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizzamaker.contract;

import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract.Calzone;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract.CalzoneType;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract.Pizza;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract.PizzaType;

public interface PizzaMaker {
    Pizza getPizza(PizzaType pizzaType);
    Calzone getCalzone(CalzoneType calzoneType);
}
