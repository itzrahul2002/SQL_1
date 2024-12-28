import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Hi {
    public static void main(String[] args) {
        System.out.println("HELLO SQL");
        String url="jdbc:mysql://localhost:3306/firstdatabase";

        String username="root";
        String password="2002";

        try(Connection connection = DriverManager.getConnection(url, username, password)){
            System.out.println("Connected to database");
            System.out.println(connection);
        }
        catch(SQLException e){
            System.err.println("Connected Failed: " + e.getMessage());
        }
    }
}
