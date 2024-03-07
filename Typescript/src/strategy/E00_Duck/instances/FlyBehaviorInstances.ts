import { FlyBehavior } from "../contract/contracts";

class FlyNoWay implements FlyBehavior {
    fly(): void {
        // bruh
    }
}

class FlyWithWings implements FlyBehavior {
    fly(): void {
        console.log("* fly with wings *");
    }
}

export { FlyNoWay, FlyWithWings };