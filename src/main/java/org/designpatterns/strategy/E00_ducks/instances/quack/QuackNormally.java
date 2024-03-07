package org.designpatterns.strategy.E00_ducks.instances.quack;

import org.designpatterns.strategy.E00_ducks.contract.QuackBehavior;
import org.designpatterns.strategy.E00_ducks.contract.SwimBehavior;

public class QuackNormally implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("* Duck quacking normally *");
    }
}
