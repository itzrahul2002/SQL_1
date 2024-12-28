package Emp_App;

public interface Emp_dao_Intrf {
    //Create Employee
    public void create_employee(Employee emp);
    //Show All Employee
    public void show_all_employees();
    //Show Employee Based on id
    public void show_employee_based_on_id(int id);
    //Update Employee
    public void update_employee(int id, String name);
    //Delete Employee
    public void delete_employee(int id);
}
