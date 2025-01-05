package Controller;

import Model.User;
import Service.RegistrationService;

public class RegistrationController {

    RegistrationService registrationService = new RegistrationService();
    public void registration(User user) {
        registrationService.registration(user);
    }
}
