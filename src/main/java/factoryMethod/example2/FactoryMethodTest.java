package factoryMethod.example2;

import factoryMethod.example2.generalizedConstructor.Warrior;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Warrior warrior = Warrior.createWarrior(1);
        System.out.println(warrior.getClass());
    }
}
