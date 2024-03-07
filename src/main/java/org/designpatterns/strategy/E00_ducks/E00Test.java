package org.designpatterns.strategy.E00_ducks;

import org.designpatterns.strategy.E00_ducks.client.Duck;
import org.designpatterns.strategy.E00_ducks.instances.fly.FlyNormally;
import org.designpatterns.strategy.E00_ducks.instances.fly.FlyWithBrokenWing;
import org.designpatterns.strategy.E00_ducks.instances.quack.QuackNormally;
import org.designpatterns.strategy.E00_ducks.instances.swim.SwimFloating;
import org.designpatterns.strategy.E00_ducks.instances.swim.SwimNormally;

public class E00Test {
    public static void main(String[] args) {
        final Duck commonDuck = new Duck();
        commonDuck.setFlyBehavior(new FlyNormally());
        commonDuck.setSwimBehavior(new SwimNormally());
        commonDuck.setQuackBehavior(new QuackNormally());
        commonDuck.doAll();
        commonDuck.setFlyBehavior(new FlyWithBrokenWing());
        commonDuck.performFly();

        System.out.println("--------------------------");

        final Duck woodenDuck = new Duck();
        woodenDuck.setSwimBehavior(new SwimFloating());
        woodenDuck.doAll();
    }
}
