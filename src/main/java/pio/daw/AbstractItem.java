package pio.daw;

abstract class AbstractItem {
    private String name;
    private String id;
    private String description;

    public AbstractItem(String name, String id, String description){
        this.name = name;
        this.id = id;
        this.description = description;
    }

    public abstract void printToConsole();
    
}