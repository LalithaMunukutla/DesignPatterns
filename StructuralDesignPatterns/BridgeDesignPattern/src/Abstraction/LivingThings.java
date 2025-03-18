package Abstraction;

import Implementation.BreatheImplementor;

public abstract class LivingThings {
    BreatheImplementor breatheImplementor;

    public LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }
    public abstract void breatheProcess();
}
