package pio.daw;

abstract class AbstractItem {
    protected String name;
    protected String id;
    protected String description;

    public AbstractItem(String name, String id, String description){
        this.name = name;
        this.id = id;
        this.description = description;
    }

    public abstract void printToConsole();
      
    
    
}