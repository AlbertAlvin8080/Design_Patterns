package org.designpatterns.factory.abstract_factory.E02_pizzaria.factory_contract;

import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract.Calzone;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract.CalzoneType;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract.Pizza;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract.PizzaType;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizzamaker.contract.PizzaMaker;

import java.text.ParseException;

public interface PizzeriaFactory {
    PizzaMaker getPizzaMaker(String date) throws ParseException;
    Pizza getPizza(PizzaMaker pizzaMaker, PizzaType pizzaType);
    Calzone getCalzone(PizzaMaker pizzaMaker, CalzoneType calzoneType);
}
