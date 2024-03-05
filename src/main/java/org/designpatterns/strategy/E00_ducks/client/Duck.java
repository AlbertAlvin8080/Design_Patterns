package org.designpatterns.strategy.E00_ducks.client;

import org.designpatterns.strategy.E00_ducks.contract.FlyBehavior;
import org.designpatterns.strategy.E00_ducks.contract.QuackBehavior;
import org.designpatterns.strategy.E00_ducks.contract.SwimBehavior;
import org.designpatterns.strategy.E00_ducks.instances.fly.NoFly;
import org.designpatterns.strategy.E00_ducks.instances.quack.NoQuack;
import org.designpatterns.strategy.E00_ducks.instances.swim.NoSwim;

public class Duck {
    private QuackBehavior quackBehavior;
    private SwimBehavior swimBehavior;
    private FlyBehavior flyBehavior;

    public Duck() {
        quackBehavior = new NoQuack();
        swimBehavior = new NoSwim();
        flyBehavior = new NoFly();
    }

    public void doAll() {
        quackBehavior.quack();
        swimBehavior.swim();
        flyBehavior.fly();
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public SwimBehavior getSwimBehavior() {
        return swimBehavior;
    }

    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
