import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_2_Data {
//    public static void main(String[] args) {
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","2002");
//            String query = "Insert into user values(102,'Rahul Keshari''C++ Developer','Rohini-110045')";
//            Statement st = c.createStatement();
//            int res = st.executeUpdate(query);
//            if(res>0){
//                System.out.println("Record Insert Successfully");
//            }
//            else {
//                System.out.println("Record Insert Failure");
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","2002");
            String query = "insert into user values(102,'Rahul Keshari','C++ Developer','Rohini-110034')";
            Statement st = con.createStatement();
            int result = st.executeUpdate(query);

            if(result>0){
                System.out.println("Record successfully Inserted");
            }
            else {
                System.out.println("Some Problem Occur");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
