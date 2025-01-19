package decorator.example2;

public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    public abstract String getDescription();

}
