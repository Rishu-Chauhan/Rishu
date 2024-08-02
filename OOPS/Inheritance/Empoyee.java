class Person{
   
    public void getFirstName(){
      System.out.println("Rishu");
    }
    public void getLastName(){
        System.out.println("Chauhan");
          }
}
class Employee1 extends Person{
    int id;
    public void EmployeeId(){
        System.out.println("getting id");
    }
}
public class Empoyee {
    public static void main(String[] args) {
        Employee1 e=new Employee1();
        e.getFirstName();
        e.getLastName();
        e.EmployeeId();
        e.id=102;
        System.out.println("id of employee is "+e.id);
    }
}
