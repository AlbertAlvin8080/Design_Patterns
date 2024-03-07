package org.designpatterns.strategy.E00_ducks.instances.fly;

import org.designpatterns.strategy.E00_ducks.contract.FlyBehavior;

public class FlyNormally implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("* Duck flying normally *");
    }
}
