public class decreasingOrder {
    public static void order(int n){
        if(n==1){
            System.out.print(n+" ");
            return ;
           
        }
        System.out.print(n+" ");
        order(n-1);
    }
    public static void main(String[]args){
        order(5);
    }
}
