package creational.prototype;

/**
 * @author Kavindu Perera
 */
public class ChocolateCake implements Cake {
    private final String frosting;
    private final int layers;

    public ChocolateCake(String frosting, int layers) {
        this.frosting = frosting;
        this.layers = layers;
    }

    @Override
    public Cake copy() {
        return new ChocolateCake(frosting, layers);
    }
}
