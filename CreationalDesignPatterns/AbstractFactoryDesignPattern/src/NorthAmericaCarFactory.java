public class NorthAmericaCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new SedanCar();
    }

    @Override
    public CarSpecifications createSpecifications() {
        return new NorthAmericaCarSpec();
    }
}
