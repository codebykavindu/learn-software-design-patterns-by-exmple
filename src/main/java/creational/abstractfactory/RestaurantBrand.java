package creational.abstractfactory;

/**
 * @author Kavindu Perera
 */
public interface RestaurantBrand {
    Waiter getWaiter();
    Cook getCook();
    Food getFood();
}
