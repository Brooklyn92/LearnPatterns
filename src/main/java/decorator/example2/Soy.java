package decorator.example2;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost() + 0.15;
        if (beverage.getSize() == Size.TALL) {
            cost += Size.TALL.getPriceSize();
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += Size.GRANDE.getPriceSize();
        } else if (beverage.getSize() == Size.VENTI) {
            cost += Size.VENTI.getPriceSize();
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";

    }
}
