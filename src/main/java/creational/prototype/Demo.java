package creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kavindu Perera
 */
public class Demo {
    private static final Logger log = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {
        Cake cake = new ChocolateCake("Chocolate", 3);
        Cake cakeCopy = cake.copy();

        log.info("Cake: {}", cake);
        log.info("Cake Copy: {}", cakeCopy);
    }
}
