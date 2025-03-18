public class EuropeCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new HatchBag();
    }

    @Override
    public CarSpecifications createSpecifications() {
        return new EuropeanCarSpec();
    }
}
