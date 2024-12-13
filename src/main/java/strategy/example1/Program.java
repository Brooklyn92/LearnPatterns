package strategy.example1;

public class Program {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
