package assignment3;

public abstract class Service {

    // TODO: declare private fields
    // serviceName
    // serviceId
    // isActive
    private String serviceName;
    private int serviceId;
    private boolean isActive;


    // TODO: constructor
    public Service(String serviceName, int serviceId) {
        this.serviceName = serviceName;
        this.serviceId = serviceId;
    }



    // TODO: activateService()
    // should set isActive = true
    // print activation message
     void activateService() {
        isActive = true;
        System.out.println("The server is : Active");
    }


    // TODO: deactivateService()
    // should set isActive = false
    // print deactivation message
     void deactivateService() {
        isActive = false;
        System.out.println("The server is : Deactivated");
    }


    // TODO: getter for serviceName

    public String getServiceName() {
        return serviceName;
    }

    // TODO: getter for isActive

    public boolean getIsActive() {
        return isActive;
    }


    // TODO: abstract method performService()
    abstract void performService();

}