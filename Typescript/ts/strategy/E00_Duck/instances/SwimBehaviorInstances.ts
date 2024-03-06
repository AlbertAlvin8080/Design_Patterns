import { SwimBehavior } from "../contract/contracts";

class SwimNoWay implements SwimBehavior {
    swim(): void {
        // bruh
    }
}

class SwimNormally implements SwimBehavior {
    swim(): void {
        console.log("* swim normally *");

    }
}

export { SwimNoWay, SwimNormally };