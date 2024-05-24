package behavioral.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kavindu Perera
 */
abstract class Sandwich {
    private static final Logger log = LoggerFactory.getLogger(Sandwich.class);

    // Define the steps (template method)
    public final void makeSandwich() {
        cutBread();
        addSpread();
        addProtein(); // Subclasses can override this
        addVegetables(); // Subclasses can override this
        addCheese(); // Optional step (can be overridden)
        toastBread(); // Optional step (can be overridden)
    }

    // Default implementations for common steps
    private void cutBread() {
        log.info("Cutting bread...");
    }

    private void addSpread() {
        log.info("Adding mayo...");
    }

    private void addCheese() {
        log.info("Adding cheese...");
    }

    private void toastBread() {
        log.info("Toasting bread...");
    }

    // Abstract methods for steps that can vary (placeholders)
    abstract void addProtein();
    abstract void addVegetables();
}
