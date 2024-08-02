class Employee{
    private int salary;
    Employee(int salary){
      this.salary=salary;
    }
    public void work(){
        System.out.println("employee is working");
    }
    public int getSalary(){
        return salary;
    }
}
class HRManager extends Employee{
      HRManager(int salary){
        super(salary);
      }
    public void work(){
        System.out.println("working as HRManager ");
    }
    public void addEmployee(){
        System.out.println("Adding the employee");

    }
}
public class practice03 {
    public static void main(String[]args){
        HRManager h=new HRManager(50000);
       System.out.println( h.getSalary());
        h.addEmployee();
        h.work();
    }
    
}
