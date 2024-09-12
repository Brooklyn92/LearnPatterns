package factoryMethod.example4;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreatorA();
        Product product = creator.factoryMethod();
        System.out.println(product.getClass()); // => class factoryMethod.example4.ConcreteProductA
    }
}