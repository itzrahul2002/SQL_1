package Emp_App;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int id;

        Emp_dao_Intrf dao = new Emp_Doa_Impl();

        System.out.println("------------Welcome To Employee Management Application------------ \n");

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Add Employee 👷‍♂️\n"+
                    "2. Show All Employee 📰\n"+
                    "3. Show All Employee Based On Id 🧑‍💻\n"+
                    "4. Update The Employee Details 🗒️\n"+
                    "5. Delete The Employee 🚫\n");


            System.out.print("Enter The Choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Employee emp = new Employee();

                    System.out.print("Enter Id : ");
                     id = sc.nextInt();
                    System.out.print("Enter Name : ");
                     name = sc.next();
                    System.out.print("Enter Salary : ");
                    int salary = sc.nextInt();
                    System.out.print("Enter Age : ");
                    int age = sc.nextInt();

                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);

                    dao.create_employee(emp);
                    break;
                case 2:
                    dao.show_all_employees();
                    break;
                case 3:
                    System.out.print("Enter ID to Show Details : ");
                    int empId =sc.nextInt();
                    dao.show_employee_based_on_id(empId);
                    break;
                case 4:
                    System.out.print("Enter Id of Employee to Update Details : ");
                    int empId1 =sc.nextInt();
                    System.out.print("Enter the New Name : ");
                     name = sc.next();
                    dao.update_employee(empId1,name);
                    break;
                case 5:
                    System.out.print("Enter the Employee Id to Delete : ");
                    id =sc.nextInt();
                    dao.delete_employee(id);
                    break;
                case 6:
                    System.out.println("Thank You for Using Our Application 😇");
                    System.exit(0);

                default:
                    System.out.println("Enter Valid Choice ❌");
                    break;

            }
        }while (true);

    }
}
