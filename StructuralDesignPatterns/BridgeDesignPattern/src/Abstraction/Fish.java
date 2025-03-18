package Abstraction;

import Implementation.BreatheImplementor;

public class Fish extends LivingThings{
    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breatheProcess();
    }
}
