import org.jetbrains.annotations.NotNull;
public class Client {
    private Vehicle vehicle;
    public Client(@NotNull VehicleFactory vehicleFactory){
        vehicle = vehicleFactory.createVehicle();
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
}
