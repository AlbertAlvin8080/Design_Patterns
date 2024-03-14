package org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract;

public abstract class Pizza {
    public abstract String getIngredients();
    public abstract PizzaType getType();

    @Override
    public String toString() {
        return "Pizza-type: %s | ingredients: %s".formatted(getType(), getIngredients());
    }
}
