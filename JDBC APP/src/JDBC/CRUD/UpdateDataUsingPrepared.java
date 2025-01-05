package JDBC.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataUsingPrepared {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Load the JDBC driver (optional for modern Java versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database connection details
            String url = "jdbc:mysql://localhost:3306/college";
            String username = "root";
            String password = "MYSQL";

            // Establish connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Prompt the user for input
            System.out.println("Enter the ID of the student you want to update:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.println("Enter the column you want to update (first_name, last_name, phone, email):");
            String column = scanner.nextLine();

            System.out.println("Enter the new value for " + column + ":");
            String newValue = scanner.nextLine();

            // SQL update statement with a placeholder
            String sql = "UPDATE STUDENT SET " + column + " = ? WHERE id = ?";

            // Create a PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set parameters for the placeholders
            preparedStatement.setString(1, newValue); // Set the new value
            preparedStatement.setInt(2, id); // Set the id

            // Execute the update and get the number of rows affected
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);

            // Close resources
            preparedStatement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
