import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert_data_to_console {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.print("Enter No. of User To Insert :");
        n=sc.nextInt();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase", "root", "2002");

        PreparedStatement pstmt = con.prepareStatement("Insert into user(id,name,course,address) values(?,?,?,?)");

        if(pstmt!=null){
            for(int i=1;i<=n;i++){
                System.out.println("Enter "+i+" User Details");

                System.out.print("Enter User Id   :");
                int id = sc.nextInt();

                System.out.print("Enter User Name :");
                String name = sc.next();

                System.out.print("Enter User Course :");
                String course = sc.next();

                System.out.print("Enter User Address :");
                String address = sc.next();

                pstmt.setInt(1,id);
                pstmt.setString(2,name);
                pstmt.setString(3,course);
                pstmt.setString(4,address);

                int result = pstmt.executeUpdate();
                System.out.println((result==0) ? "User Details Not Submitted 🚫" : result+" User Details Submitted ✅");
            }
        }
    }
}
