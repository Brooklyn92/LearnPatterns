package strategy.example9;

// Конкретная стратегия: оплата наличными
public class CashPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Оплачено " + amount + " рублей наличными.");
    }
}
