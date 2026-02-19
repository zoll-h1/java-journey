package assignment3;

public class Customer extends User {

    // TODO: constructor
    public Customer(String name, int id) {
        super(name, id);
    }


    @Override
    public void manageService(Service s) {

        // TODO:
        // print that customer cannot manage services
        System.out.println("Customer can not manage services");

    }

    @Override
    public void useService(Service s) {

        // TODO:
        // print customer using message
        // call performService()
        System.out.println("Customer using...");
        s.performService();

    }
}