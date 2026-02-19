package assignment3;

public abstract class User {

    // TODO: declare fields
    // name
    // id
    private String name;
    private int id;


    // TODO: constructor
    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    // TODO: abstract method manageService(Service s)
    abstract void manageService(Service S);


    // TODO: abstract method useService(Service s)
    abstract void useService(Service s);

}