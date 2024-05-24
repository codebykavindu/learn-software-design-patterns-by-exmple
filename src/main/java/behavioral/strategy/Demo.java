package behavioral.strategy;

/**
 * @author Kavindu Perera
 */
public class Demo {

    public static void main(String[] args) {
        Character character = new Character(new Sword());
        character.attack();

        character.setWeapon(new Axe());
        character.attack();
    }
}
