import { FlyBehavior, QuackBehavior, SwimBehavior } from "../contract/contracts";
import { FlyNoWay, FlyWithWings } from "../instances/FlyBehaviorInstances";
import { QuackNoWay, QuackNormally } from "../instances/QuackBehaviorInstances";
import { SwimNoWay, SwimNormally } from "../instances/SwimBehaviorInstances";

export class Duck {
    flyBehavior: FlyBehavior;
    quackBehavior: QuackBehavior;
    swimBehavior: SwimBehavior;

    constructor() {
        this.flyBehavior = new FlyWithWings();
        this.swimBehavior = new SwimNormally();
        this.quackBehavior = new QuackNormally();
    }

    public doAll():void {
        this.flyBehavior.fly();
        this.quackBehavior.quack();
        this.swimBehavior.swim();
    }
}