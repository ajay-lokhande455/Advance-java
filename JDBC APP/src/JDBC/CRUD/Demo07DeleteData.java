package JDBC.CRUD;

import java.sql.*;
import java.util.Collections;

public class Demo07DeleteData {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "MYSQL";
        Connection connection = DriverManager.getConnection(url, username, password);
        String sql = "DELETE FROM student WHERE id = 2;";
        Statement statement = connection.createStatement();
        int rowAffected = statement.executeUpdate(sql);
        if (rowAffected > 0) {
            System.out.println("data deleted successfully!!!");
        }else {
            System.out.println("failed!!!!!");
        }
        connection.close();
    }
}
