package singleton.example5;

/**
 * Использование условной блокировкой для сведение к минимуму использования синхронизации в методе getInstance()
 */
public class ChocolateBoiler1 {
    private boolean empty;
    private boolean boiler;

    private volatile static ChocolateBoiler1 chocolateBoiler1;

    private ChocolateBoiler1() {
        empty = true;
        this.boiler = false;
    }

    public static ChocolateBoiler1 getInstance() {
        if (chocolateBoiler1 == null) {
            synchronized (ChocolateBoiler1.class) {
                if (chocolateBoiler1 == null);
                chocolateBoiler1 = new ChocolateBoiler1();
            }
        }
        return chocolateBoiler1;
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
