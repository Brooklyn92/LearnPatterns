package strategy.example1;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Mute Quack");
    }
}
