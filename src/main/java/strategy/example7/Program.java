package strategy.example7;

public class Program {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Bird();

        System.out.println("Dog " + animal1.fly());
        System.out.println("Bird " + animal2.fly());

        animal1.setFlyStrategy(new ItFlys());

        System.out.println("Dog " + animal1.fly());
    }
}
