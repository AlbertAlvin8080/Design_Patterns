package org.designpatterns.factory.abstract_factory.E02_pizzaria;

import org.designpatterns.factory.abstract_factory.E02_pizzaria.factory_contract.PizzeriaFactory;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.factory_instance.TwoGuysPizzeriaFactory;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract.Calzone;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.calzone.contract.CalzoneType;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract.Pizza;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizza.contract.PizzaType;
import org.designpatterns.factory.abstract_factory.E02_pizzaria.model.pizzamaker.contract.PizzaMaker;

import java.text.ParseException;

public class E02Test {
    public static void main(String[] args) throws ParseException {
        System.out.println();
        final PizzeriaFactory twoGuysPizzeriaFactory = new TwoGuysPizzeriaFactory();
        
        {
            final PizzaMaker pizzaMaker = twoGuysPizzeriaFactory.getPizzaMaker("14/03/2024");
            final Pizza pizza = twoGuysPizzeriaFactory.getPizza(pizzaMaker, PizzaType.HAM);
            System.out.println(pizza);
            final Calzone calzone = twoGuysPizzeriaFactory.getCalzone(pizzaMaker, CalzoneType.HAM);
            System.out.println(calzone);
        }
        System.out.println("------------------------------------------------------------------");
        {
            final PizzaMaker pizzaMaker = twoGuysPizzeriaFactory.getPizzaMaker("15/03/2024");
            final Pizza pizza = twoGuysPizzeriaFactory.getPizza(pizzaMaker, PizzaType.PEPPERONI);
            System.out.println(pizza);
            final Calzone calzone = twoGuysPizzeriaFactory.getCalzone(pizzaMaker, CalzoneType.PEPPERONI);
            System.out.println(calzone);
        }
    }
}
