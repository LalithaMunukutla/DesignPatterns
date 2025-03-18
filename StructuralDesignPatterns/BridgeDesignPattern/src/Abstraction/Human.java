package Abstraction;

import Implementation.BreatheImplementor;

public class Human extends LivingThings{
    public Human(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breatheProcess();
    }
}
