package JDBC.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo03InsertingData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "MYSQL";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        String sql = "INSERT INTO student(id, first_name, last_name, phone, email) VALUES (1, 'Ajay', 'Lokhande', 874587, 'ajay@gmail.com');";
        int isRowAffected = statement.executeUpdate(sql);
        if (isRowAffected > 0){
            System.out.println("Data inserted successfully..!!!");
        }else {
            System.out.println("Data insertion is failed..!!!");
        }
        connection.close();
    }
}
