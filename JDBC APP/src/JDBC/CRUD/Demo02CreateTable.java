package JDBC.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo02CreateTable {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "MYSQL";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        String sql = "CREATE TABLE student(id INT, first_name VARCHAR(50), last_name VARCHAR(50), phone INT, email VARCHAR(50));";

        boolean isCreated = statement.execute(sql);

        if (isCreated){
            System.out.println("table creation is failed..!");
        }else {
            System.out.println("table creation successfully..!!!");
        }

        connection.close();
    }
}
