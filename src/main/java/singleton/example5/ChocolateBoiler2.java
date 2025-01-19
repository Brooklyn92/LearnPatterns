package singleton.example5;

/**
 * Для безопасной оработки в многопоточной реализации, необхожимо в метод getInstance() пометить ключевым словом
 * synchronized. Мы тем самым заставляем каждый поток дожидаться своей очереди для входа в него.
 */
public class ChocolateBoiler2 {
    private boolean empty;
    private boolean boiler;

    private static ChocolateBoiler2 chocolateBoiler2;

    private ChocolateBoiler2() {
        empty = true;
        this.boiler = false;
    }

    public synchronized static ChocolateBoiler2 getInstance() {
        if (chocolateBoiler2 == null) {
                chocolateBoiler2 = new ChocolateBoiler2();
            }
        return chocolateBoiler2;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiler = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiler()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiler()) {
            boiler = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiler() {
        return boiler;
    }
}
