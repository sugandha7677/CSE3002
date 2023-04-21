package Module5;

// Java Database Connectivity 

// step 1 -- import package
import java.sql.*;

public class JdbcConnectivity {
    public static void main(String[] args) throws Exception {

        // Step 2: Load the JDBC driver and register it
        Class.forName("com.mysql.jdbc.Driver");
        // forName is a method which help to load the class-- Driver

        // Step 3: Set up the connection URL
        String url = "jdbc:mysql://localhost:3307/mydatabase";
        // where "mydatabase" is the name of the database you want to connect to.

        // Step 4: Open a connection to the database //connection is an interface
        // cant create object directly so getConnection method of a class DriverManager
        // which help to create object of connection

        String username = "myusername";
        String password = "mypassword";
        // 3 parameter
        Connection connection = DriverManager.getConnection(url, username, password);

        // Step 5: create the statement
        // create object of statement
        Statement statement = connection.createStatement();
        // fetch the data using query and store it inside the interface ResultSet
        ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");


        // Step 6: Process the results
        // for single data fetching
        // resultSet.next(); and dont use while loop
        while (resultSet.next()) {

            String name = resultSet.getString("username"); // to fetch string value
            int marks = resultSet.getInt("marks"); // to fetch int value
            System.out.println(name + " " + marks);
            // process the result...
        }

        // Step 7: Close the connection
        statement.close();
        connection.close();

    }
}