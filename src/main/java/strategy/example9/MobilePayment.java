package strategy.example9;

// Конкретная стратегия: оплата через мобильное приложение
public class MobilePayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплачено " + amount + " рублей через мобильное приложение.");
    }
}
