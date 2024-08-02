public class OptimixedPower {
    public static int OptimumPower(int a,int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return a;
        }
        if(n<0){
            n=-n;
            a=1/a;
        }
        int halfPower=OptimumPower(a, n/2);
        int halfPowerSqr=halfPower*halfPower;
        if(n % 2 !=0){
             halfPowerSqr=a*halfPower*halfPower;
        }
        return halfPowerSqr;
    }
   public static void main(String[]args){
    int a=2; 
    int n=1;
     System.out.println(OptimumPower(a, n));
   } 
}
