abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal contructor is called");
       color ="Brown";
    }
    void eat(){
        System.out.println("eating food");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called");
    }
    void changeColor(){
      color="black brown";
    }
    void walk(){
        System.out.println("walking on 4 legs");
    }
}
class mastang extends Horse{
    mastang(){
        System.out.println("mastang contructor is called");
    }
}
class Chicken extends  Animal{

    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walking on 2 legs");
    }
}
public class AbstractionClass {
    public static void main(String[] args) {
        // Horse h=new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
       

        // Chicken c=new Chicken();
        // c.eat();
        // c.walk();
       // mastang m=new mastang(); 
    }
    
}
