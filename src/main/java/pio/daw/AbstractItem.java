package pio.daw;

abstract class AbstractItem {
    private String name, id, description;

    public AbstractItem(String name, String id, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
    }

    public abstract void printToConsole();
}

class Book extends AbstractItem {
    public Book() {
        super("Book", "1", "Simple book");
    }

    public void printToConsole() {
        System.out.println("This is a book");
    }
}

public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        b.printToConsole();
    }
}