package creational.abstractfactory;

/**
 * @author Kavindu Perera
 */
public class LineCook implements Cook {
    @Override
    public String prepareFood() {
        return "Your burger is ready!";
    }
}
