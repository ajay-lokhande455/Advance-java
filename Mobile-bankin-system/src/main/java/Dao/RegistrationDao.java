package Dao;

import Model.User;
import Utilties.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistrationDao {
    public void registration(User user) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        
        String sql = "insert into registration (fullname, email, username, password) values(?,?, ?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getFullName());
        preparedStatement.setString(2, user.getEmail());
        preparedStatement.setString(3, user.getUsername());
        preparedStatement.setString(4, user.getPassword());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }
}
