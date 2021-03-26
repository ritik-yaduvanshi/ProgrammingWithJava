final class EmployeeData{//this is a final class and it will not be inherited by any sub class
    public final int empage;//class variables
    public final String empname;//final makes of variable like a Constant
    public final int empid;
    public final String empDep = "Computer Science";
    //if you use final with static then identifier must in uppercase
    public static final String EMPDEP = "Computer Science";

    //If you do not initialize a value of variable then you must create a Constructor for give a value
    public EmployeeData(int empage, String empname,int empid) {
        this.empage = empage;
        this.empname = empname;
        this.empid = empid;
    }

    public final void displayData(){
        //empage = 20;it will give an error you can't change a value of any variable if you are using final
        System.out.println("Employee Name :\s"+empname);
        System.out.println("Employee id :\s"+empid);
        System.out.println("Employee Age :\s"+empage);
        System.out.println("Employee Department :\s"+empDep);
    }
}
public class FinalTest {
    public static void main(String[] args) {
        EmployeeData data = new EmployeeData(35,"CodexRitik",23);
        data.displayData();

    }
}
