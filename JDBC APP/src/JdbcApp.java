import java.sql.*;

public class JdbcApp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // step 1 : add the connector jar to the project

        //step 2 : load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 3: get the connection
        String url = "jdbc:mysql://localhost:3306/hr_Schema";
        String username = "root";
        String password = "MYSQL";
        Connection connection = DriverManager.getConnection(url, username, password);

        //step 4: execute the query
        String query =  "select * from employees WHERE first_name like '%a%' ORDER BY employee_id;";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        //step 5: get the result
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("employee_id")+ "\t"+
                    resultSet.getString("first_name") + "\t"+
                    resultSet.getString("last_name") + "\t"
            );
        }
        //step 6: close the connection
        connection.close();
    }
}