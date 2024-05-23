package creational.abstractfactory;

/**
 * @author Kavindu Perera
 */
public class Server implements Waiter {
    @Override
    public String takeOrder() {
       return "What can I get you today?";
    }
}
