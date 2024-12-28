package Emp_App;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Emp_Doa_Impl implements Emp_dao_Intrf{
    Connection con;
    @Override
    public void create_employee(Employee emp) {
        con = DB_Connection.createDBConnection();
        String query="Insert into employee values(?,?,?,?)";
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1,emp.getId());
            pstmt.setString(2,emp.getName());
            pstmt.setDouble(3, emp.getSalary());
            pstmt.setInt(4,emp.getAge());
            int cnt = pstmt.executeUpdate();
        if(cnt != 0){
            System.out.println("Employees Inserted Successfully");
        }

        }catch (Exception e){

        }
    }

    @Override
    public void show_all_employees() {
        con = DB_Connection.createDBConnection();
        String query="Select * from employee";
        System.out.println("Employees Details : ");
        System.out.printf("\t\t%s\t%s\t%s\t%s\n","ID","NAME","SALARY","AGE");
        System.out.println("\t\t-------------------------");

        try{
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while(result.next()){
                System.out.format("\t\t%d\t%s\t%d\t%d\n"
                        ,result.getInt(1),
                        result.getString(2),
                        result.getInt(3),
                        result.getInt(4));
                System.out.println("\t\t-------------------------");

            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void show_employee_based_on_id(int id) {
        con = DB_Connection.createDBConnection();
        String query = "select * from employee where id ="+id;
        System.out.printf("\t\t%s\t%s\t%s\t%s\n","ID","NAME","SALARY","AGE");
        System.out.println("\t\t-------------------------");

        try{
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while(result.next()){
                System.out.format("\t\t%d\t%s\t%d\t%d\n"
                        ,result.getInt(1),
                        result.getString(2),
                        result.getInt(3),
                        result.getInt(4));
                System.out.println();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void update_employee(int id, String name) {
        con = DB_Connection.createDBConnection();
        String query ="Update employee Set name=? where id=?";
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setInt(2,id);
            int cnt= pstmt.executeUpdate();

            if(cnt!=0)
                System.out.println("Employee Details Updated Successfully !! ");

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void delete_employee(int id) {
        con = DB_Connection.createDBConnection();
        String  query ="Delete from employee where id =?  ";
        try{
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, id);
            int cnt = pstm.executeUpdate();

            if(cnt != 0)
                System.out.println("Employee Deleted Successfully!! ");

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
