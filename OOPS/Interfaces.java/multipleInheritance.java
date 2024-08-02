interface Hervivorse{
 void  meet();
}
interface Carnivorse{
void veg();
}
class Bear implements Hervivorse,Carnivorse{
    public void meet(){
        System.out.println("Bear can eat both veg and non veg food");
    System.out.println("eating chickens,animal,fish,etc:");
    }
    public void veg(){
    System.out.println("eating plants,food and vegitables");
    }
}
public class multipleInheritance {
    public static void main(String[] args) {
       Bear b=new Bear();
       b.meet();
       b.veg();
    }
    
}
