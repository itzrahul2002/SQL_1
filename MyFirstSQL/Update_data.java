import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update_data {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","2002");
        Statement stmt = con.createStatement();

        String query="Update user set address='Rohini-110065' where id=102";
        int result = stmt.executeUpdate(query);
        if(result!=0){
            System.out.println("Record update Successfully");
        }
        else {
            System.out.println("Record update Failure");
        }
    }
}
