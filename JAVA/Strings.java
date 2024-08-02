// import java.util.*;
public class Strings {
    public static void printLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
            }
            System.out.println();
    }
        public static void main(String[] args) {
            // String str="abcd";
            // String str2=new String("xyz");
            // //String are IMMUTABLE
            // Scanner sc= new Scanner(System.in);
            // String name=sc.nextLine();
            // System.out.println(name);
            // String fullName="Rishu chauhan";
            // System.out.println(fullName.length());
            // concatinate
            String firstName="Rishu";
            String lastName="Chauhan";
            String fullName=firstName+" "+lastName;
           // System.out.println(fullName);

            //charAt
          //  System.out.println(fullName.charAt(0));
           printLetter(fullName);
        }
    }
    
    

