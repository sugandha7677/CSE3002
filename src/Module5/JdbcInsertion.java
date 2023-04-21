package Module5;
// step 1 -- import package
import java.sql.*;

public class JdbcInsertion {
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

        //Sring query = "insert into myTable values(" + 5 + "," + 'Mahini'+ "")"
        int count = statement.executeUpdate("insert into myTable values('mohini', 43)");
        System.out.println(count + "rows affected");

        // when we need to add many values
        String query = "insert into myTable values(?, ?)";
        PreparedStatement statement2 = connection.prepareStatement(query);

        statement2.setString(1, "Mohini");
        statement2.setInt(2, 78);

        int count1 = statement2.executeUpdate();

        // Step 6: Process the results
        
        System.out.println(count1 + "rows affected");

        // Step 7: Close the connection
        statement.close();
        connection.close();

    }
}