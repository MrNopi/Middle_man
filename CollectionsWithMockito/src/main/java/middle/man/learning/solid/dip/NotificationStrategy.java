package middle.man.learning.solid.dip;

public class NotificationStrategy {
    public INotificationService getNotificationService(String serviceName) throws Exception {
        if(serviceName.equalsIgnoreCase("email")) {
            return new EmailNotificationService();
        } else {
            throw new Exception("Unable to inject service with service name " + serviceName);
        }
    }
}
