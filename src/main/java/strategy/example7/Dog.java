package strategy.example7;

public class Dog extends Animal {

    public Dog() {
        flyStrategy = new CanFly();
    }
}
