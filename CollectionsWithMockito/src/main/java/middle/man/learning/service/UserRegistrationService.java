package middle.man.learning.service;

public class UserRegistrationService {
    private final INotificationService notificationService;

    public UserRegistrationService(INotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public String register() {
        registerUser();
        return notificationService.send("Notification for User");
    }

    private void registerUser() {
        System.out.println("User has been registered");
    }
}
