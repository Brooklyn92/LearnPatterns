package strategy.example1;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Эта утка летает с помощью ракетного двигателя");
    }
}
