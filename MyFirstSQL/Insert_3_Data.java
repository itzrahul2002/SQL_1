import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_3_Data {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","2002");
            String query = "insert into user values(103,'Akash','Mearn Stack','Faridabad-140014')";
            Statement st = con.createStatement();
            int ans = st.executeUpdate(query);
            if (ans>0) {
                System.out.println("Record inserted Successfully");
            }
            else {
                System.out.println("Record Insert Failed");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
