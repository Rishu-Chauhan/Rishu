public class increasingOrder1 {
    public static void Order(int n){
        if(n==1){
            System.out.print(n+" ");
            return ;
        }
        Order(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Order(5);
    }
}
