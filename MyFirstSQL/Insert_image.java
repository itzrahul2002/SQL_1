import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_image {
    public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","2002");

        PreparedStatement pstmt = con.prepareStatement("insert into imgTable (name,photo) values(?,?)");

        pstmt.setString(1,"Ducat");
        FileInputStream fin = new FileInputStream("C:\\Users\\RAHUL THAKUR\\MyFirstSQL\\Image\\MahadevWallper.jpg");
        pstmt.setBinaryStream(2,fin,fin.available());

        int i = pstmt.executeUpdate();
        System.out.println(i+"Records inserted");

        con.close();
    }
}
