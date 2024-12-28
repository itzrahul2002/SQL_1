import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Insert_and_print {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.print("Enter No of User To Insert : ");
        n=sc.nextInt();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","2002");
        PreparedStatement ptsmt = con.prepareStatement("insert into user(id,name,course,address) values(?,?,?,?)");

        if(ptsmt!=null){
            for(int i=1;i<=n;i++){
                System.out.println("Enter "+i+" User Details :");

                System.out.print("Enter User Id      : ");
                int id = sc.nextInt();
                System.out.print("Enter User Name    : ");
                String name = sc.next();
                System.out.print("Enter User Course: ");
                String course = sc.next();
                System.out.print("Enter User Address : ");
                String address = sc.next();

                ptsmt.setInt(1,id);
                ptsmt.setString(2,name);
                ptsmt.setString(3,course);
                ptsmt.setString(4,address);

                int result = ptsmt.executeUpdate();
                System.out.println((result==0) ? "User Details Not Submitted 🚫" : result+" User Details Submitted ✅");
            }
        }
        ResultSet rs = ptsmt.executeQuery("Select * from User");
        while(rs.next()){
            System.out.println("---------------------------------");
            System.out.println("User Id  is  :   "+rs.getInt(1));
            System.out.println("User Name is :   "+rs.getString(2));
            System.out.println("User Course Is : "+rs.getString(3));
            System.out.println("User Address Is  "+rs.getString(4));
            System.out.println("---------------------------------");

        }
    }
}
