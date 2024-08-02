class Animal{
    void eat(){
        System.out.println("eat");
    }
}
class fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
class mammal extends Animal{
    void walk(){
        System.out.println("walk");
    }
}
public class hierachyInheritance {
    public static void main(String []args){
          fish f=new fish();
          f.eat();
          f.swim();
    }
    
}
