package factoryMethod.example2;

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
