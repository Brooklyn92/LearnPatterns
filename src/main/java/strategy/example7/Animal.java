package strategy.example7;

public class Animal {
    private String name;
    protected Flyable flyStrategy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flyable getFlyStrategy() {
        return flyStrategy;
    }

    public void setFlyStrategy(Flyable flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public String fly() {
        return flyStrategy.fly();
    }
}
