package creational.abstractfactory;

/**
 * @author Kavindu Perera
 */
public class CasualDiner implements RestaurantBrand {
    @Override
    public Waiter getWaiter() {
        return new Server();
    }

    @Override
    public Cook getCook() {
        return new LineCook();
    }

    @Override
    public Food getFood() {
        return new Burger();
    }
}
