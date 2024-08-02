public class customClass {
    public static void main(String[] args) {
          Dog<String,String> d=new Dog<>("Leo","sandy");
          Dog<Integer,String> d2=new Dog<>(12,"Mandy");
          System.out.println(d.getId());
          System.out.println(d2.getId());
          System.out.println(d.getName());
          System.out.println(d2.getName());
    } 
}
class Dog<E,V>{
E id;
V name;
Dog(E id,V name){
    this.id=id;
    this.name=name;
}
E getId(){
    return id;
}
V getName(){
    return name;
}
}
