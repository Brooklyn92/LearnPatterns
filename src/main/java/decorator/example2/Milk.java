package decorator.example2;

public class Milk extends CondimentDecorator {

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
