package strategy.example4;

public class DeliveryService {
    private DeliveryStrategy strategy;

    //Установка стратегии
    public void setDeliveryStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    //Расчёт стоимости доставки
    public double calculatorCost(double weight) {
        if (strategy == null) {
            throw new IllegalStateException("Стратегия доставки не установлена!");
        }
        return strategy.calculateCost(weight);
    }
}
