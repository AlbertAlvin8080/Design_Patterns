import { QuackBehavior } from "../contract/contracts";

class QuackNoWay implements QuackBehavior {
    quack(): void {
        // bruh
    }
}

class QuackStruggling implements QuackBehavior {
    quack(): void {
        console.log("* struggling to quack :( *");
    }
}

class QuackNormally implements QuackBehavior {
    quack(): void {
        console.log("* quacking normally *");
    }
}

export { QuackNoWay, QuackNormally, QuackStruggling }