package strategy.example1;

public class FlyWithWings implements  FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }
}
