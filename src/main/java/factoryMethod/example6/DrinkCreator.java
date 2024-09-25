package factoryMethod.example6;

public abstract class DrinkCreator {

    public abstract Drink pourDrink();

    public abstract Drink pourDrink(DrinkTypes types);

    public String displayMessage() {
        return "Take your ";
    }
}
