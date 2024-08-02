
class Shape{
    int length=40,breadth=50;
    public int getArea(){
   return length*breadth;
    }
}
class Rectangle extends Shape{
    int length=4,breadth=5;
  public    int getArea(){
     return length*breadth;
    }
}
public class practice02 {
    public static void main(String[]args){
Rectangle rec=new Rectangle();
    System.out.println(rec.getArea());
    }
    
}
