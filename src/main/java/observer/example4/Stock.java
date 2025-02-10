package observer.example4;

import java.util.ArrayList;
import java.util.Random;

public class Stock implements Subject  {

    StockInfo stockInfo;
    ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(stockInfo);
        }
    }

    static class StockInfo {
        public int usd;
        public int euro;
    }

    public Stock() {
        stockInfo = new StockInfo();
    }

    public void setRate() {
        Random random = new Random();
        stockInfo.euro  = random.nextInt(50) + 70;
        stockInfo.usd  = random.nextInt(50) + 50;
        notifyObservers();
    }
}
