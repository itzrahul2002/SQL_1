import java.sql.Connection;
import java.sql.DriverManager;

public class Check_Connection {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","2002");
            if(con!=null) {
                System.out.println("Connection Successfully Eastablished");
            }
            else {
                System.out.println("Connection Failure");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
