interface Animal{
    void eat();
    void sleep();
}
class Dog implements Animal{
public void eat(){
    System.out.println("eating");
}
public void sleep(){
    System.out.println("sleeping");
}
}
public class ObjectOfInterface {
    public static void main(String[]args){
     Animal a=new Dog();
     a.eat();
     a.sleep();
    }
}
