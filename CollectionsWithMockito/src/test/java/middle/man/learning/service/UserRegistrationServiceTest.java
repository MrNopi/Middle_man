package middle.man.learning.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserRegistrationServiceTest {
    @Mock
    private INotificationService notificationService;

    private static final String MOCKED_MESSAGE = "Great job, everyone!";



    @org.junit.jupiter.api.Test
    void register() {
        Mockito.when(notificationService.send(Mockito.anyString())).thenReturn(MOCKED_MESSAGE);
        UserRegistrationService userService = new UserRegistrationService(notificationService);

        String actualMessage = userService.register();
        Mockito.verify(notificationService).send(Mockito.anyString());
        Assertions.assertEquals(actualMessage, MOCKED_MESSAGE);
    }
}