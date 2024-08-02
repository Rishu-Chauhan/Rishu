public class XpowerN {
    public static int power(int x,int n){
        if(n==1){
            return x;
        }
        // int xnm1=power(x,n-1);
        // int xmn=x*xnm1;;
        // return xmn;
        return x*power(x, n-1);
    }
    public static void main(String[]args){
       System.out.println(power(-2,2 ));
    }
    
}
