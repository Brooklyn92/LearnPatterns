package factoryMethod.example6;

public class TeaCreator extends DrinkCreator {

    @Override
    public Drink pourDrink() {
        return new Tea();
    }
}
