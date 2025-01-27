package strategy.example9;

public class CardPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Оплачено " + amount + " рублей картой.");
    }
}
