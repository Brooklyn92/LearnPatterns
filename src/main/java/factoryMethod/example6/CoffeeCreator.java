package factoryMethod.example6;

import factoryMethod.example6.coffee.Americano;
import factoryMethod.example6.coffee.Cappuccino;
import factoryMethod.example6.coffee.Espresso;
import factoryMethod.example6.coffee.Late;

import static factoryMethod.example6.CoffeeTypes.*;

public class CoffeeCreator extends DrinkCreator {

    @Override
    public Drink pourDrink() {
        return new Coffee();
    }

    @Override
    public Drink pourDrink(DrinkTypes type) {
        switch ((CoffeeTypes) type) {
            case ESPRESSO: return new Espresso();
            case LATE : return new Late();
            case CAPPUCCINO: return new Cappuccino();
            case AMERICANO: return new Americano();
            default:return null;
        }
    }
}
