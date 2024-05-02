package jdbc;
import java.sql.*;

public class JDBCExample {

    public static void main(String[] args) throws Exception {
        // Create a connection to the database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog_app", "root", "Suraj@123");

        // Create a statement object
        Statement statement = connection.createStatement();

        // Execute the query
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

        // Iterate over the results
        while (resultSet.next()) {
            // Get the values of the columns
            int id = resultSet.getInt("id");
            String about = resultSet.getString("about");
            String email = resultSet.getString("email");

            // Print the results
            System.out.println(id + ", " + about + ", " + email);
        }

        // Close the connection
        connection.close();
    }
}