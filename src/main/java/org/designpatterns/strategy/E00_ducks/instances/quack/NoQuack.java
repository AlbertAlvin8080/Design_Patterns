package org.designpatterns.strategy.E00_ducks.instances.quack;

import org.designpatterns.strategy.E00_ducks.contract.QuackBehavior;

public class NoQuack implements QuackBehavior {
    @Override
    public void quack() {
        // You look closer into the depths
    }
}
