package pio.daw;

public class Cars extends AbstractItem{

    private String name;
    private String id;
    private String description;
    private String matricula;

    public Cars(String name, String id, String description, String matricula){
        super(name, id, description);
        this.name = name;
        this.id = id;
        this.description = description;
        this.matricula = matricula;
    }

    public void printToConsole(){
        System.out.println("Name: " + this.name);
        System.out.println("Id: " + this.id);
        System.out.println("Description: " + description);
        System.out.println("Description: " + matricula);
    }
    
}
