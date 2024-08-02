class Vehicle{
    public void drive(){
     System.out.println("Repairing the Vehicles");
    }
}
class Car extends Vehicle{
    public void drive(){
     System.out.println("Repairing the car");
    }
} 
public class practice01 {
 public static void main(String[]args){
    Car c=new Car();
    c.drive();
 }   
}
