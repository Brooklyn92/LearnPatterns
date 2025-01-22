package strategy.example7;

public class CanFly implements Flyable {
    @Override
    public String fly() {
        return "не может летать";
    }
}
