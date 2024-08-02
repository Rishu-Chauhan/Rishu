class Animal{
    String color;
    void eat(){
        System.out.println("Eat");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
class mammal extends Animal{
    int legs;
}
class dog extends mammal{
    String breed;
}

public class multiLevelInheritence {
    public static void main(String []args){
       dog sandy=new dog();
       sandy.eat();
       sandy.legs=4;
       System.out.println(sandy.legs);
       sandy.color="blue";
       System.out.println(sandy.color);
    }
    
}
