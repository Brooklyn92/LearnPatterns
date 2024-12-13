package strategy.example1;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Эта утка не умеет летать");
    }
}
