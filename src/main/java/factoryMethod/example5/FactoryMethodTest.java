package factoryMethod.example5;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car toyota  = factory.create("Toyota");
        toyota.drive();
    }
}
