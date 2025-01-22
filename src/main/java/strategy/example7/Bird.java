package strategy.example7;

public class Bird extends Animal {

    public Bird() {
        flyStrategy = new ItFlys();
    }
}
