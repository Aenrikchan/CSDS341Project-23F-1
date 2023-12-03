//jdbc
import java.sql.*;
// mssql
//import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }

  //// Connect to database. Uses Microsoft SQL Server.
  //private void connectToDatabase() {
  //  try {
  //    // Load the JDBC driver
  //    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
  //    System.out.println("Driver loaded");

  //    // Establish a connection
  //    Connection connection = DriverManager.getConnection
  //      ("jdbc:sqlserver://localhost:1433;databaseName=TestDB;user=sa;password=pass;");
  //    System.out.println("Database connected");

  //    // Create a statement
  //    Statement statement = connection.createStatement();

  //    // Execute a statement
  //    ResultSet resultSet = statement.executeQuery
  //      ("select firstName, mi, lastName from Student where lastName "
  //      + " = 'Smith'");

  //    // Iterate through the result and print the student names
  //    while (resultSet.next())
  //      System.out.println(resultSet.getString(1) + "\t" +
  //        resultSet.getString(2) + "\t" + resultSet.getString(3));

  //    // Close the connection
  //    connection.close();
  //  }
  //  catch (Exception ex) {
  //    ex.printStackTrace();
  //  }
  //}
}
