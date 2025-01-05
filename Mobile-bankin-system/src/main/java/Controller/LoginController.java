package Controller;

import Model.User;
import Service.LoginService;

public class LoginController {
    LoginService loginService = new LoginService();
    public void bankLogin(User user) {
        loginService.bankLogin(user);
    }
}
