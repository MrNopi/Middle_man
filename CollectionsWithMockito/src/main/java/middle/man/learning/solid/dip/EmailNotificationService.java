package middle.man.learning.solid.dip;

public class EmailNotificationService implements INotificationService {
    @Override
    public void notify(String clientName) {
        System.out.printf("Notifying %s via email... ", clientName);
    }
}
