package singleton.example5;

/**
* Создание экземпляра класса заранее
 */
public class ChocolateBoiler3 {
    private boolean empty;
    private boolean boiler;

    private static ChocolateBoiler3 chocolateBoiler3 = new ChocolateBoiler3();

    private ChocolateBoiler3() {
        empty = true;
        this.boiler = false;
    }

    public static ChocolateBoiler3 getInstance() {
        return  chocolateBoiler3;
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
