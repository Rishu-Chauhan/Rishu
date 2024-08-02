class Student{
    static int returnPercentage(int math,int phys,int chem){
     return (math+phys+chem)/3;
    }
    String name;
    int rollno;
   static  String schoolName;
   void setName(String name){
    this.name=name;
   }
   String getName(){
    return this.name;
   }
}

public class staticKeyword {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName="UPS";
        Student s2=new Student();
        System.out.println(s2.schoolName);
        Student s3=new Student();
        // s3.schoolName="IIT";
        // Student s4=new Student();
        // System.out.println(s4.schoolName);
        System.out.println(s1.returnPercentage(90,98,97));
    }
    
}
