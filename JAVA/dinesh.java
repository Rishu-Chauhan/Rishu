class Dk{
    String name;
    int rollNo;
    int legs;
    int weight;
    Dk(String name,int rollNo,int legs,int weight){
        this.name=name;
        this.rollNo=rollNo;
        this.legs=legs;
        this.weight=weight;
    }
    void run(){
        System.out.println("running very fast");
    }
}
public class dinesh {
    public static void main(String[]args){
    Dk d=new Dk("Dinesh",28,2,52);
    System.out.println("Your Name is: "+d.name);
    System.out.println("Your RollNo is: "+d.rollNo);
    System.out.println("Your legs is: "+d.legs);
    System.out.println("Your weight is: "+d.weight);
    System.out.println("Thank you for giving your details:");
    }    
}
