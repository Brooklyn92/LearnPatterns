package factoryMethod.example8;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Ship deliver");
    }
}
