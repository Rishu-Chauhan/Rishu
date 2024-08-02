import java.util.*;
public class CollectionList {
    public static void main(String[]args){
       List <Integer> list=new ArrayList<>();
       List <Integer> list2=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list2.add(10);
        list2.add(49);
        list2.add(50);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(1);
       // list.addAll(list2);
       // list.removeAll(list2);
        list.retainAll(list2);//====>INTERSECTION OF TWO LIST
       // list.clear();
        System.out.println(list);
    }
}
