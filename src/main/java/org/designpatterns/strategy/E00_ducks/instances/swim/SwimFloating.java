package org.designpatterns.strategy.E00_ducks.instances.swim;

import org.designpatterns.strategy.E00_ducks.contract.SwimBehavior;

public class SwimFloating implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("* Duck floating *");
    }
}
