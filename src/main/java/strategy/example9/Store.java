package strategy.example9;

// Контекст: магазин, который принимает оплату
public class Store {
    private PaymentStrategy paymentStrategy;

    // Установка стратегии
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Выполнение оплаты
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
