package strategy.example4;

public class CourierDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(double weight) {
        return 50 + weight * 5;
    }
}
