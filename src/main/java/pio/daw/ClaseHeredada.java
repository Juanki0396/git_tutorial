package pio.daw;

public class ClaseHeredada extends AbstractItem {

    String color;
    
    public ClaseHeredada(String name, String id, String description, String color){
        super (name, id, description);
        this.color = color;
    }
}
