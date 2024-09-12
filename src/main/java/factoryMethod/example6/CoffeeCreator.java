package factoryMethod.example6;

public class CoffeeCreator extends DrinkCreator {

    @Override
    public Drink pourDrink() {
        return new Coffee();
    }
}
