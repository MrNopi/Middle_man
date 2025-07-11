package middle.man.learning;

import middle.man.learning.entity.Employee;
import middle.man.learning.entity.Manager;
import middle.man.learning.entity.User;
import middle.man.learning.solid.dip.NotificationStrategy;
import middle.man.learning.solid.dip.RightOrderService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {

    private static final NotificationStrategy notificationStrategy = new NotificationStrategy();

    private static final List<User> users = List.of(
            new User("John", 25),
            new User("Andrew", 25),
            new User("Linda", 37),
            new User("Layla", 37),
            new User("Maria", 37),
            new User("Annita", 18),
            new User("Hanna", 18)
    );


    public static void main(String[] args) {
//        Map<Integer, List<String>> groupedUsers = groupUsersByAge(users);
//        System.out.println(groupedUsers);
//        System.out.println(new Manager(1000).calculateSalary());
        RightOrderService orderService = null;
        try {
            orderService = new RightOrderService(notificationStrategy.getNotificationService("email"));
        } catch (Exception ignore){}
        if (orderService != null) {
            orderService.createOrder();
        }
    }

    private static Map<Integer, List<String>> groupUsersByAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::getAge, Collectors.mapping(User::getName, Collectors.toList())));
    }


}