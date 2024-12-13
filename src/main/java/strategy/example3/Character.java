package strategy.example3;

public abstract class Character {
    WeaponBehavior weaponBehavior;


    public void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior wb) {
        this.weaponBehavior = wb;
    }
}
