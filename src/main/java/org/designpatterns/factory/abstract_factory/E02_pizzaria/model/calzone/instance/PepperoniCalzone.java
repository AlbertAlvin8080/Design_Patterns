package org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.instance;

import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract.Calzone;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract.CalzoneType;

public class PepperoniCalzone extends Calzone {
    @Override
    public String getIngredients() {
        return "cheese, pepperoni, tomato";
    }

    @Override
    public CalzoneType getType() {
        return CalzoneType.PEPPERONI;
    }
}
