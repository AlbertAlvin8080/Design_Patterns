import { Duck } from "./client/Duck"
import { FlyNoWay } from "./instances/FlyBehaviorInstances";
import { QuackStruggling } from "./instances/QuackBehaviorInstances";

const duck: Duck = new Duck();
duck.doAll();

console.log("----------------------");

duck.flyBehavior = new FlyNoWay();
duck.quackBehavior = new QuackStruggling();
duck.doAll();