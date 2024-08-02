
class Animal{
    void eat(){
        System.out.println("eating..");
    }

    void breathe(){
        System.out.println("breathing..");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swiming..");
    }
}
class Tuna extends Fish{
    void bad(){
        System.out.println("bad fish");
    }
}
class shark extends Fish{
    void danger(){
        System.out.println("dangerous fish");
    }
}
class bird extends Animal{
    void fly(){
        System.out.println("flying in the sky..");
    }
}
class peacock extends bird{
    void beauty(){
        System.out.println("beautiful birds");
    }
}
public class HybridInheritance {
    public static void main(String []args){
   Tuna t=new Tuna();
   t.bad();
   t.eat();
   t.swim();
   t.breathe();
   
    }
    
}
