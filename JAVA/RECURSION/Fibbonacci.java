public class Fibbonacci {
    public static int  Fib(int n){
        if(n==0 || n==1){
            return n;
        }
       
        int Fn1=Fib(n-1);
        int Fn2=Fib(n-2);
        int Fn=Fn1+Fn2;
        return Fn;
    }
    public static void main(String[]args){
      System.out.println( Fib(5));
    }
}
