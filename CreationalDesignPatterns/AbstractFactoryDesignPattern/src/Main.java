//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarFactory cf1 = new NorthAmericaCarFactory();
        Car c1 = cf1.createCar();
        CarSpecifications cs1 = cf1.createSpecifications();
        c1.assemble();
        cs1.printSpecs();

        CarFactory cf2 = new EuropeCarFactory();
        Car c2 = cf2.createCar();
        CarSpecifications cs2 = cf2.createSpecifications();
        c2.assemble();
        cs2.printSpecs();
    }
}