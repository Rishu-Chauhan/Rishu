class Animal{
    Animal(){
        System.out.println("Animal constructor is called");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    Dog(){
        super();
        System.out.println("dog constructor is called");
    }
    public void eat(){
        super.eat();
        System.out.println("Dog is eating");
        
    }
}
public class superKeyword {
    public static void main(String[] args) {
        Dog g=new Dog();
        g.eat();
    }
    
}
