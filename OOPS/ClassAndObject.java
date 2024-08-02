public class ClassAndObject{
    public static void main(String args[]){
    //  Pen p1=new Pen();
    //  p1.setColor("Red");
    //  System.out.println("The color of pen is "+p1.color);
    //  p1.setTip(5);
    //  System.out.println("The tip of pen is "+p1.tip);
    Student s=new Student();
    s.setName("Rishu");
    System.out.println(s.name);
    s.setAge(19);
    System.out.println(s.age);
    s.calcPercentage(90,93,91);
    System.out.println(s.percentage);
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    void setName(String n){
        name=n;
    }
    void setAge(int newAge){
        age=newAge;
    }
    void calcPercentage(int phys,int chem,int math ){
        percentage=(phys+chem+math)/3;
    } 
}