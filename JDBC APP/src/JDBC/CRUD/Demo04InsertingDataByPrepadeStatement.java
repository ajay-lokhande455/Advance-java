package JDBC.CRUD;

import javax.swing.text.Style;
import java.sql.*;
import java.util.Scanner;

public class Demo04InsertingDataByPrepadeStatement {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "MYSQL";
        Connection connection = DriverManager.getConnection(url, username, password);

        //get data from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your id , first name , last name, phone, email");
        int id = scanner.nextInt();
        String first_name = scanner.next();
        String last_name = scanner.next();
        int phone = scanner.nextInt();
        String email = scanner.next();


        String sql = "INSERT INTO student(id, first_name, last_name, phone, email) VALUES (?, ?, ?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2,first_name);
        preparedStatement.setString(3,last_name);
        preparedStatement.setInt(4,phone);
        preparedStatement.setString(5,email);

        int isUpdated = preparedStatement.executeUpdate();
        if(isUpdated > 0){
            System.out.println("Data insert successful...!!!");
        }else {
            System.out.println("Data insert failed...!!!");
        }
        connection.close();

    }
}
