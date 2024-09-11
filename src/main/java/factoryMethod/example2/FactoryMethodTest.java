package factoryMethod.example2;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Warrior warrior = Warrior.createWarrior(1);
        System.out.println(warrior.getClass());
    }
}
