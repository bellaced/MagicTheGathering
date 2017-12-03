import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection{
  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    try {
      conn = DriverManager.getConnection(
      "jdbc:mysql://localhost/MagicTheGathering?" +
      "user=root&password=BeLLaceds1996");
      // Do something with the connection.
      stmt = conn.createStatement();
    }
  }
}
