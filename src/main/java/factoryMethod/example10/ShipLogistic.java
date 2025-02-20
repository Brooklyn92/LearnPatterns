package factoryMethod.example10;

public class ShipLogistic  extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
