package observer.example4;

import java.util.Random;

public class Broker implements Observer {
    Subject stock;
    String name;

    public Broker(Subject stock, String name) {
        this.stock = stock;
        this.name = name;
        stock.addObserver(this);
    }

    public void stopTrade() {
        stock.removeObserver(this);
        stock = null;
    }

    @Override
    public void update(Object o) {
        Stock.StockInfo stockInfo = (Stock.StockInfo) o;
        if (stockInfo.usd > 30 + new Random().nextInt(40)) {
            System.out.println(name + " Брокер продаёт "  + stockInfo.usd);
        } else {
            System.out.println(name + " Брокер покупает " + stockInfo.usd);
        }
    }
}
