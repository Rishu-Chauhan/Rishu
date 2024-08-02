import java.util.*;
public class listOfString {
public static void main(String[] args) {
    List<String> fruits=new ArrayList<>();
    fruits.add("Kiwi");
    fruits.add("papaya");
    fruits.add("mango");
    fruits.add("Apple");
    for(int i=0;i<fruits.size();i++){
        System.out.println("fruits is"+fruits.get(i));
    }
      for(String fruit:fruits){
        System.out.println("for each fruit"+fruit);
      }

      Iterator<String> fs=fruits.iterator();
      while(fs.hasNext()){
        System.out.println("iterator "+fs.next());
      }
      List<String> smallList=fruits.subList(1, 3);
      System.out.println(smallList);
}
}
