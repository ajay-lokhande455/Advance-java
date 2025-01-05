package JDBC.CRUD;
import java.sql.*;
public class Demo01CreateDatabase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "MYSQL";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        String sql = "CREATE DATABASE college;";
        boolean isExecuted = statement.execute(sql);
        if (isExecuted){
            System.out.println("database creation is failed..!");
        }else {
            System.out.println("Database successfully created");
        }
        connection.close();
    }
}
