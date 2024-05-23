package creational.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kavindu Perera
 */
public class Customer {
    private static final Logger log = LoggerFactory.getLogger(Customer.class);

    public static void main(String[] args) {
        RestaurantBrand brand = new CasualDiner();

        Waiter waiter = brand.getWaiter();
        Cook cook = brand.getCook();
        Food food = brand.getFood();

        log.info("{}", waiter.takeOrder());
        log.info("{}", cook.prepareFood());
        log.info("{}", food.getFoodType());
    }
}
