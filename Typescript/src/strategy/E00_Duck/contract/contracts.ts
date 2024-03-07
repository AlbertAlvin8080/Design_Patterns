export { FlyBehavior, QuackBehavior, SwimBehavior }

interface FlyBehavior {
    fly(): void;
}

interface QuackBehavior {
    quack(): void;
}

interface SwimBehavior {
    swim(): void;
}