import Abstraction.Fish;
import Abstraction.Human;
import Abstraction.LivingThings;
import Abstraction.Tree;
import Implementation.AirBreathe;
import Implementation.BreatheImplementor;
import Implementation.LandBreathe;
import Implementation.WaterBreathe;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LivingThings lt1 = new Human(new LandBreathe());
        LivingThings lt2 = new Fish(new WaterBreathe());
        LivingThings lt3 = new Tree(new AirBreathe());
        lt1.breatheProcess();
        lt2.breatheProcess();
        lt3.breatheProcess();
    }
}