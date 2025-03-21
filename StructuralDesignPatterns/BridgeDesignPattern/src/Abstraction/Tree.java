package Abstraction;

import Implementation.BreatheImplementor;

public class Tree extends LivingThings{
    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breatheProcess();
    }
}
