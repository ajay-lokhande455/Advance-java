package Dao;

import Model.User;
import Utilties.ConnectionUtil;
import java.sql.*;

public class LoginDao {
    public void userLogin(User user) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("select * from login where username=? and password=?");
        preparedStatement.setString(1, user.getUsername());
        preparedStatement.setString(2, user.getPassword());

        ResultSet resultSet = preparedStatement.executeQuery();

        User user1 = new User();
        while (resultSet.next()) {
            user1.setUsername(resultSet.getString(1));
            user1.setPassword(resultSet.getString(2));
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
