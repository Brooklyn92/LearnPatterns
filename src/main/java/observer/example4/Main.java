package observer.example4;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        Observer broker1 = new Broker(stock, "Миша");
        Observer broker2 = new Broker(stock, "Петя");
        Observer broker3 = new Broker(stock,"Маша");

        stock.setRate();
        pause();

        stock.setRate();
        pause();

        stock.setRate();
        pause();

        stock.notifyObservers();
    }

    private static void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
