package factoryMethod.example2.generalizedConstructor;

import factoryMethod.example2.Archer;
import factoryMethod.example2.Horseman;
import factoryMethod.example2.Infantryman;

public abstract class Warrior {
    public static Warrior createWarrior(int i) {
        switch (i) {
            case 1:
                return new Archer();
            case 2:
                return new Horseman();
            case 3:
                return new Infantryman();
            default:
                System.out.println("Error");
                return null;
        }
    }
}
