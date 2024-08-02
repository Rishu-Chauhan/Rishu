class person{
    String name;
    String city;
    person(String name,String city){
        this.name=name;
        this.city=city;
    }
}
class myName extends person{
    int rollno;
    int idno;
    myName(String name,String city,int rollno,int idno){
        super(name,city);
        this.rollno=rollno;
        this.idno=idno;
    }
}
public class superKeyword1 {
    public static void main(String[] args) {
        myName m1=new myName("Rishu","Baburi",68,101);
        System.out.println(m1.name);
        System.out.println(m1.city); 
        System.out.println(m1.rollno); 
        System.out.println(m1.idno);
    }
    
}
