package strategy.example3;

public class Game {
    public static void main(String[] args) {
        Character troll = new Troll();
        troll.fight();
        troll.setWeaponBehavior(new KnifeBehavior());
        troll.fight();
    }
}
