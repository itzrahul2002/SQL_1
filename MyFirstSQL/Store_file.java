import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Store_file {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","2002");

        PreparedStatement ps = con.prepareStatement("insert into filetable (id,name) values(?,?)");

        File f =new File("C:\\Users\\RAHUL THAKUR\\MyFirstSQL\\text");

        FileReader fr= new FileReader(f);
        ps.setInt(1,101);
        ps.setCharacterStream(2,fr,(int)f.length());

        int i = ps.executeUpdate();
        System.out.println(i+"Record Insert successfully");

        con.close();

    }
}
