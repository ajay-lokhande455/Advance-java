import java.sql.*;

public class InsertData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Step 1: Add the connector jar to the project

        // Step 2: Load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 3: Get the connection
        String url = "jdbc:mysql://localhost:3306/hr_Schema";
        String username = "root";
        String password = "MYSQL";
        Connection connection = DriverManager.getConnection(url, username, password);

            // Step 4: Execute the insert query
            String insertQuery = "INSERT INTO departments(department_id, department_name, location_id) VALUES (17, 'finance', 1800);";
            Statement statement = connection.createStatement();
            int rowAffected = statement.executeUpdate(insertQuery);
            System.out.println("Rows affected: " + rowAffected);

            // Step 5: Execute the SELECT query to print the data
            String selectQuery = "SELECT * FROM departments;";
            ResultSet resultSet = statement.executeQuery(selectQuery);

            // Print the table data
            System.out.println("Department Table Data:");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("department_id")+ "\t"+
                        resultSet.getString("department_name") + "\t"+
                        resultSet.getString("location_id") + "\t"
                );
            }

            // Step 6: Close the connection
            connection.close();
    }
}
