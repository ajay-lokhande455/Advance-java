package Service;

import Dao.LoginDao;
import Model.User;
import lombok.SneakyThrows;

public class LoginService {
    LoginDao bankDao = new LoginDao();
    @SneakyThrows
    public void bankLogin(User user) {
        bankDao.userLogin(user);
    }

}
