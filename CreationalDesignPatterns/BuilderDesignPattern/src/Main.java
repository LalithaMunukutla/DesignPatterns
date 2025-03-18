//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Builder b1 = new GamingComputerBuilder();
        Builder b2 = new StudentComputerBuilder();
        Director d = new Director();
        d.constructComputer(b1);
        d.constructComputer(b2);
        b1.getResult();
        b2.getResult();
    }
}