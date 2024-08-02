import java.util.*;

public class MethodOfList {
public static void main(String[]args){
     List <Integer> list=new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    System.out.println(list.get(0));
    list.set(2, 200);
    list.add(2,50);
    list.remove(2);
    System.out.println(list);

}    
}
