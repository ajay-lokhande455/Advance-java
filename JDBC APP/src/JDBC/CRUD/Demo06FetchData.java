package JDBC.CRUD;

import java.awt.geom.RectangularShape;
import java.sql.*;

public class Demo06FetchData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "MYSQL";
        Connection connection = DriverManager.getConnection(url, username, password);

        String sql = "SELECT * FROM student";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+"\t"+
                    resultSet.getString(2)+"\t"+
                    resultSet.getString(3)+"\t"+
                    resultSet.getInt(4)+"\t"
            );
        }
        connection.close();

    }
}
