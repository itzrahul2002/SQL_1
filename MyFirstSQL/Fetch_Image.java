import java.io.FileOutputStream;
import java.sql.*;

public class Fetch_Image {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","2002");
        PreparedStatement pstmt = con.prepareStatement("Select * from imgtable");

        ResultSet rs = pstmt.executeQuery();

        if(rs.next()) {
            Blob b = rs.getBlob(2);

            byte barr[] = b.getBytes(1,(int)b.length());

            FileOutputStream fout = new FileOutputStream("C:\\Users\\RAHUL THAKUR\\MyFirstSQL\\Image\\MahadevImg.jpg");
            fout.write(barr);

            fout.close();

        }
        System.out.println("OK");
        con.close();
    }
}
