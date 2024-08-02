public class TilesProblem {
    public static int tillingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int Fnm1=tillingProblem(n-1);
        //horizontal choice
        int Fnm2=tillingProblem(n-2);
        int totWays=Fnm1+Fnm2;
        return totWays;
    } 
public static void main(String[]args){
System.out.println("there are following "+tillingProblem(5)+ " ways of filling the floor");
}

}
