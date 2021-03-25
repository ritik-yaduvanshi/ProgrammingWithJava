import java.util.Scanner;

class Employee{
    private int emp_id;//Instance variables
    private String emp_name;
    public int emp_age;

    //getter setter for private value
    public void setEmp_id(int emp_id){
        this.emp_id = emp_id;
        //this keyword is used for refereing a value for Instance variable
    }
    public int getEmp_id(){
        return emp_id;
    }
    public void setEmp_name(String emp_name){
        this.emp_name = emp_name;
    }
    public String getEmp_name(){
        return emp_name;
    }
    //creating constructor for age
    public Employee(int age){
        this.emp_age = age;
    }
    //Using Static variable
    public static int empid;
    public static String empname;
    public static int empage;
    public Employee(int id,String name,int age){
        empid = id;
        empname = name;
        empage = age;
    }
    //display method
    public void display(){
        System.out.println("Employee Name:\s"+empname+"\n"+"Employee id:\s"+empid+"\n"+"Employee age:\s"+empage);
    }
}
public class MethodImplementation {
    //creating a main method
    public static void main(String[] args) {
        //Creating a scanner class for taking a user input
        Scanner scan = new Scanner(System.in);
        //creating a obj of Employee class
        Employee employeeStatic = new Employee(12,"CodexRitik",20);//Static Employee object
        Employee employee = new Employee(25);
        System.out.println("Enter the Id Of Employee:");
        employee.setEmp_id(scan.nextInt());
        System.out.println("Enter the Employee Name:");
        employee.setEmp_name(scan.next());
        //finally displaying the data of employee
        System.out.println("Emplyoee Name:\s"+employee.getEmp_name());
        System.out.println("Employee id:\s"+employee.getEmp_id());
        System.out.println("Employee Age:\s"+employee.emp_age);
        System.out.println("------------------------------>");
        System.out.println("This is a data Of Employee using Static variable");
        employee.display();//method call
    }
}
