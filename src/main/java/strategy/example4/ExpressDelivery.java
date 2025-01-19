package strategy.example4;

public class ExpressDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(double weight) {
        return 100 + weight * 10;
    }
}
