package Emp_App;
import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {
    static Connection con;
    public static Connection createDBConnection(){
        try {
            // load the Driver Class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //get the Connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","2002");

        }catch (Exception ex){
            ex.printStackTrace();
        }

        return con;
    }
}
