package strategy.example1;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior  = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Я резиновая уточка");
    }
}
