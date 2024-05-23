package creational.abstractfactory;

/**
 * @author Kavindu Perera
 */
public class Butler implements Waiter {
    @Override
    public String takeOrder() {
        return ("May I take your order, sir?");
    }
}
