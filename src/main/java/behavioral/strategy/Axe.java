package behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kavindu Perera
 */
public class Axe implements Weapon {
    private static final Logger log = LoggerFactory.getLogger(Axe.class);
    @Override
    public void attack() {
        log.info("Attacking with an axe");
    }
}
