package factoryMethod.example10;

public class RoadLogistic extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
