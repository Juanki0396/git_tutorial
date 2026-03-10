package pio.daw;

/**
 * A simple concrete implementation of {@link AbstractItem}.
 * This class just demonstrates subclassing and overrides the
 * abstract method with a basic behavior.
 */
public class SubItem extends AbstractItem {
    public SubItem(String name, String id, String description) {
        super(name, id, description);
    }

    @Override
    public void printToConsole() {
        // simple implementation; not accessing private fields
        System.out.println("SubItem instance printing to console");
    }
}
