package org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract;

import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract.PizzaType;

public abstract class Calzone {
    public abstract String getIngredients();
    public abstract CalzoneType getType();

    @Override
    public String toString() {
        return "Calzone-type: %s | ingredients: %s".formatted(getType(), getIngredients());
    }
}
