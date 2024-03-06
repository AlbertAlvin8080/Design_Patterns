package org.designpatterns.strategy.E00_ducks.instances.fly;

import org.designpatterns.strategy.E00_ducks.contract.FlyBehavior;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        // It's too late
    }
}
