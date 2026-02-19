package assignment3;

public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field
    private boolean isPremium = false;



    // TODO: constructor
    public CloudStorageService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }


    @Override
    public void performService() {

        // TODO:
        // check if active
        // print cloud access message
        if(getIsActive()) {
            System.out.println("Is active : " + getIsActive() + ", You have given the cloud access...");
        }
        else {
            System.out.println("Not Active...");
        }
    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // enable premium
        // print message
        isPremium = true;
        System.out.println("Now you have a premium...");

    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("Billing message...");

    }
}