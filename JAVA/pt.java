import java.util.Scanner;
public class pt {
    public static void main(String []args){
        //int p1=15,p2=15,p3=15;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark in pt1");
        int mark1=sc.nextInt();
        System.out.println("Enter the mark in pt2");
        int mark2=sc.nextInt();
        System.out.println("Enter the mark in pt3");
        int mark3=sc.nextInt();
        int a=(mark1+mark2);
        int b=(mark2+mark3);
        int c=(mark1+mark3);
        int maxMark=Math.max(a, b);
        int maxMark1=Math.max( b,c);
        int maxMark2=Math.max(maxMark,maxMark1);
        System.out.println("maximum mark obtained by student in two pt out of three pt = "+maxMark2);
        if(maxMark2>=10 && maxMark2<=30){
            System.out.println("Student is passed !  ");
        }
        else if(maxMark>30){
            System.out.println("You entered Invalid number which is out of bound for pt number!");
        }
       else{

        System.out.println(" SOORY, student You are failed:");
       }
    }
}
