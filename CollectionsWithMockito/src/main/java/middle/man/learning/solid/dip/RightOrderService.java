package middle.man.learning.solid.dip;

public class RightOrderService {
    INotificationService notificationService;

    public RightOrderService(INotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void createOrder() {
        notificationService.notify("Andrew");
    }
}
