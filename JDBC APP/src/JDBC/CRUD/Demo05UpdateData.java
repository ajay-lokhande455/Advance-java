package JDBC.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo05UpdateData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "MYSQL";
        Connection connection = DriverManager.getConnection(url, username, password);

        String sql = "UPDATE STUDENT SET email= 'ajay455@gmail.com' WHERE id = 1;";
        Statement statement = connection.createStatement();
        int isRowAffected = statement.executeUpdate(sql);
        if (isRowAffected > 0){
            System.out.println("Data inserted successfully..!!!");
        }else {
            System.out.println("Data insertion is failed..!!!");
        }
        connection.close();


    }
}
