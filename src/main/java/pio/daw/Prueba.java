package pio.daw;

public class Prueba extends AbstractItem {

    public Prueba(String name, String id, String description) {
        super(name, id, description);
    }

    @Override
    public void printToConsole() {
        System.out.println("Name: " + super.name);
        System.out.println("ID: " + super.id);
        System.out.println("Description: " + super.description);
    }
    
}
