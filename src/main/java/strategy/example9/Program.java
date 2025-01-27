package strategy.example9;

public class Program {
    public static void main(String[] args) {
        Store store = new Store();

        // Оплата наличными
        store.setPaymentStrategy(new CashPayment());
        store.checkout(100);

        // Оплата картой
        store.setPaymentStrategy(new CardPayment());
        store.checkout(250);

        // Оплата через мобильное приложение
        store.setPaymentStrategy(new MobilePayment());
        store.checkout(500);
    }
}
