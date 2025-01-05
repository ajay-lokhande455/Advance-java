package Service;

import Dao.RegistrationDao;
import Model.User;
import lombok.SneakyThrows;

public class RegistrationService {
    RegistrationDao registrationDao = new RegistrationDao();
    @SneakyThrows
    public void registration(User user) {
        registrationDao.registration(user);
    }
}
