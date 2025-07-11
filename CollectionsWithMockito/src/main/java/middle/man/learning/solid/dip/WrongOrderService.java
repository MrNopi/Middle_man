package middle.man.learning.solid.dip;

public class WrongOrderService {
    private INotificationService notificationService;

    public void createOrder() {
        notificationService = new EmailNotificationService();

        notificationService.notify("John");
    }
}
