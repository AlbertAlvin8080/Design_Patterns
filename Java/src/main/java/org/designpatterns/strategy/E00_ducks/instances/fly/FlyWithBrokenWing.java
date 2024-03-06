package org.designpatterns.strategy.E00_ducks.instances.fly;

import org.designpatterns.strategy.E00_ducks.contract.FlyBehavior;

public class FlyWithBrokenWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("* Duck struggling to fly *");
    }
}
