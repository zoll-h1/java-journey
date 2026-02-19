package assignment3;

public class StreamingService extends Service
        implements PremiumFeature {

    // TODO: declare premium field
    private boolean isPremium = false;


    // TODO: constructor
    public StreamingService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {

        // TODO:
        // check if service is active
        // print different message for premium and normal
        if (!getIsActive()) {
            if (isPremium) {
                System.out.println("It's Premium");
            } else {
                System.out.println("It's normal");
            }
        } else {
            System.out.println("UnAvailable");
        }
    }
    @Override
    public void upgradeToPremium() {

        // TODO:
        // set premium = true
        // print message
        isPremium = true;
        System.out.println("You have been upgraded to premium");
    }
}