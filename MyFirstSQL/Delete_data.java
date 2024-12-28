import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete_data {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","2002");
        String query = "delete from user where id=103";
        Statement st = con.createStatement();
        int result = st.executeUpdate(query);

        if(result!=0){
            System.out.println("Record deleted Successfully 😉");
        }
        else {
            System.out.println("Record deleted Failure 🚫");
        }
    }
}
