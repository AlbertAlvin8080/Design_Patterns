package org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.instance;

import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract.Calzone;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract.CalzoneType;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract.PizzaType;

public class HamCalzone extends Calzone {
    @Override
    public String getIngredients() {
        return "cheese, ham, tomato";
    }

    @Override
    public CalzoneType getType() {
        return CalzoneType.HAM;
    }
}
