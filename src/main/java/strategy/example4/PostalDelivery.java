package strategy.example4;

public class PostalDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(double weight) {
        return 20 + weight * 2;
    }
}
