import java.util.Scanner;
class BankAccount{
    int totMoney;
    BankAccount(int totMoney){
   this.totMoney=totMoney;
    }
    public void deposite(){
       System.out.println("money is diposited");
    }
    public void withdraw(){
    System.out.println("money is withdrawl ");
    }
}
class SavingAccount extends BankAccount{
    Scanner sc=new Scanner(System.in);
    int totMoney=1000;
    SavingAccount(int totMoney){
     super(totMoney);
    }
     public void withdraw(){
     System.out.println("enter Amount to withdrawl");
     int temp=sc.nextInt();
     totMoney=totMoney-temp;
     if(totMoney<=100){
        System.out.println(" SORRY. you cannot withdrawl money");
        System.out.println("your money is insufficient  in your account ");
        System.out.println("your money left in account = "+totMoney);
        System.out.println("please leave atleast 100 rupees in your account");
     }
     
     else{
        System.out.println( temp+ " rupees is  withdrawl successfully");
     System.out.println("the remaining money ="+totMoney);
     }
     
     }
     public void deposite(){
        System.out.println("enter Amount to deposite in your bank");
        int temp=sc.nextInt();
        totMoney=totMoney+temp;
        System.out.println("money is deposited");
        totMoney=totMoney+temp;
        System.out.println("total money = "+totMoney);
     }
     
}
public class practice04 {
    public static void main(String[]args){
      SavingAccount sa=new SavingAccount(1000);
      sa.withdraw();
      sa.deposite();
      }
    }
    

