package creational.abstractfactory;

/**
 * @author Kavindu Perera
 */
public class Chef implements Cook {
    @Override
    public String prepareFood() {
        return "Exquisite dish prepared with finesse!";
    }
}
