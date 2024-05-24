package behavioral.strategy;

/**
 * @author Kavindu Perera
 */
public class Character {
    private Weapon weapon;

    public Character(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.attack();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
