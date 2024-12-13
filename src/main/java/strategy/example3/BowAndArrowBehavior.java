package strategy.example3;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Стреляю из лука");
    }
}
