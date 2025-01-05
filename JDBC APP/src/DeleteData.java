import java.sql.*;

public class DeleteData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Step 1: Add the connector jar to the project

        // Step 2: Load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 3: Get the connection
        String url = "jdbc:mysql://localhost:3306/hr_Schema";
        String username = "root";
        String password = "MYSQL";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // Step 4: Execute the DELETE query
            String deleteQuery = "DELETE FROM employees WHERE employee_id = 207;";
            Statement statement = connection.createStatement();
            int rowAffected = statement.executeUpdate(deleteQuery);

            if (rowAffected > 0) {
                System.out.println("Deletion successful!");
            } else {
                System.out.println("No records found with the specified ID. Deletion failed.");
            }

            // Step 5: Execute the SELECT query to print the data
            String selectQuery = "SELECT * FROM employees;";
            ResultSet resultSet = statement.executeQuery(selectQuery);

            // Print the table data
            System.out.println("Employee Table Data:");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("employee_id") + "\t" +
                        resultSet.getString("first_name") + "\t" +
                        resultSet.getString("last_name") + "\t");
            }
        }
        // Step 6: Close the connection
    }
}
