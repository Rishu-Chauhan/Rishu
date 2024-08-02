import java.util.Scanner;
public class sumOfNum {
    public static void main(String[]args){
        int sum=0;
     
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter your number");
        for(int i=0;i<n;i++){
           sum+=i;
           
        }
        System.out.println(sum);
    }
    
}
