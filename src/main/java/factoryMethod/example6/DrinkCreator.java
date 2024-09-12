package factoryMethod.example6;

public abstract class DrinkCreator {

    public abstract Drink pourDrink();

    public String displayMessage() {
        return "Take your ";
    }
}
