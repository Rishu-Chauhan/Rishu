import java.util.*;
public class CollectionofStack {
    public static void main(String []args){
        Stack<String> fruits=new Stack<>();
       fruits.push("A");
       fruits.push("B");
       fruits.push("C");
       fruits.push("D");
       System.out.println(fruits);
       System.out.println(fruits.peek());
       System.out.println(fruits.pop());
       System.out.println(fruits);
    } 
}
