package behavioral.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kavindu Perera
 */
public class ClubSandwich extends Sandwich {
    private static final Logger log = LoggerFactory.getLogger(ClubSandwich.class);


    @Override
    void addProtein() {
        log.info("Adding turkey...");
    }

    @Override
    void addVegetables() {
        log.info("Adding lettuce, tomato, and bacon...");
    }
}
