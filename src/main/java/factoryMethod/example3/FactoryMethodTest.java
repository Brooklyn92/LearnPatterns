package factoryMethod.example3;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Warrior warrior = new Archer();
        System.out.println(warrior.getWeapon().getClass()); // => class factoryMethod.example3.Bow
    }
}
