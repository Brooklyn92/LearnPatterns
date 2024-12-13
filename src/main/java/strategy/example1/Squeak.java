package strategy.example1;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Резиновые утки пищат");
    }
}
