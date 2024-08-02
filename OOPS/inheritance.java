class Animal{
    String color;
    void eat(){
        System.out.println("Eat");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swiming in the water");
    }
}
public class inheritance {
    public static void main(String []args){
        Fish shark=new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }
    
}
