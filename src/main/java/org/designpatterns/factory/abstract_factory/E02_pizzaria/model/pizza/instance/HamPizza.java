package org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.instance;

import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract.Pizza;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract.PizzaType;

public class HamPizza extends Pizza {
    @Override
    public String getIngredients() {
        return "cheese, ham, tomato";
    }

    @Override
    public PizzaType getType() {
        return PizzaType.HAM;
    }
}
