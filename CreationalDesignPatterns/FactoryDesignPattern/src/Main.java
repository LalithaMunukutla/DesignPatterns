//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client client = new Client(twoWheelerFactory);
        Vehicle v1 = client.getVehicle();
        v1.printVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Client c2 = new Client(fourWheelerFactory);
        Vehicle v2 = c2.getVehicle();
        v2.printVehicle();
    }
}