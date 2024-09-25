package factoryMethod.example8;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Truck deliver");
    }
}
