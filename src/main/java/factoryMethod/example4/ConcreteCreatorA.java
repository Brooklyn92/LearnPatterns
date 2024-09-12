package factoryMethod.example4;

public class ConcreteCreatorA  extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
