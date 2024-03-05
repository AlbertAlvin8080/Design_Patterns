package org.designpatterns.strategy.E00_ducks.instances.swim;

import org.designpatterns.strategy.E00_ducks.contract.SwimBehavior;

public class NoSwim implements SwimBehavior {
    @Override
    public void swim() {
        // Gro'Goroth notices you
    }
}
