package factoryMethod.example6;

public class DrinkMachine {
    public static void main(String[] args) {
        DrinkCreator teaCreator = new TeaCreator();
        System.out.print(teaCreator.displayMessage());
        teaCreator.pourDrink();
        System.out.println();
        DrinkCreator coffeeCreator = new CoffeeCreator();
        System.out.print(coffeeCreator.displayMessage());
        coffeeCreator.pourDrink();
    }
}
