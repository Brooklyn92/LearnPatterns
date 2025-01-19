package decorator.example1;

public class Program {
    public static void main(String[] args) {
        Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        c.doOperation(); // Результат выполнения программы "Hello, World!"
        c.newOperation(); // New hello operation
    }
}
