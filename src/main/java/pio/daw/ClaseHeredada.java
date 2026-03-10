package pio.daw;

public class ClaseHeredada extends AbstractItem {

    private String color;
    
    public ClaseHeredada(String name, String id, String description, String color){
        super (name, id, description);
        this.color = color;
    }

    @Override
    public void printToConsole(){
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Description: " + this.description);
        System.out.println("Color: " + this.color);
    }
}
