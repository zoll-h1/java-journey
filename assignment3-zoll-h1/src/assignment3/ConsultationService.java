package assignment3;

public class ConsultationService extends Service
        implements Billable {

    // TODO: constructor
    public ConsultationService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }


    @Override
    public void performService() {

        // TODO:
        // check active
        // print consultation message
        if(getIsActive()) {
            System.out.println("Consultation...");
        }
        else {
            System.out.println("Not Active...");
        }
    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("Here is your billing...");

    }
}