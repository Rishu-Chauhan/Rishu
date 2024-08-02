public class constructorOfJava {
    public static void main(String []args){
        //this type constructor is called Constructor OverLoading
   // Student s1=new Student();
    Student s2=new Student("Rishu");
    Student s3=new Student(68);
    Student s4=new Student("RishuChauhan",69);
    System.out.println("The name of student is "+s2.name);
    System.out.println("The roll number of student is "+s3.rollno);
    System.out.println("The name of student is "+s4.name);
    System.out.println("The roll number of student is "+s4.rollno);
    }  
}
class Student{
    String name;
    int rollno;
    Student(){        
     System.out.println("Constructor is called...");
    }
    Student(String name){
     this.name=name;       
    }
    Student(int rollno){
        this.rollno=rollno;
    }
    Student(String name,int rollno){
     this.name=name;
     this.rollno=rollno;
    }
}