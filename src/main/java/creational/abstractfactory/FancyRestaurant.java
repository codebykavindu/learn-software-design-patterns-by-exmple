package creational.abstractfactory;

/**
 * @author Kavindu Perera
 */
public class FancyRestaurant implements RestaurantBrand {
    @Override
    public Waiter getWaiter() {
        return new Butler();
    }

    @Override
    public Cook getCook() {
        return new Chef();
    }

    @Override
    public Food getFood() {
        return new GourmetDish();
    }
}
