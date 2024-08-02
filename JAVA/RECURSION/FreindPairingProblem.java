public class FreindPairingProblem {
    public static int pair(int n){
     if(n==1 || n==2){
        return n;
     }
     int totWays=pair(n-1)+(n-1)*pair(n-2);
     return totWays;
    }
    public static  void main(String[]args){
      System.out.println(pair(6));
    }
}
