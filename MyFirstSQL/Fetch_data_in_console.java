import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Fetch_data_in_console {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","2002");
        Statement stmt = cn.createStatement();
        ResultSet rs =stmt.executeQuery("Select * from user");

        while (rs.next()){
            System.out.println("----------------------------------------------");
            System.out.println("Id is      : "+rs.getInt(1));
            System.out.println("Name is    : "+rs.getString(2));
            System.out.println("Course is  : "+rs.getString(3));
            System.out.println("Address is : "+rs.getString(4));
            System.out.println("----------------------------------------------");

        }
    }
}
