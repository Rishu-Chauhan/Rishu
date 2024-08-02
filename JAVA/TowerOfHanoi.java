public class TowerOfHanoi {
    public static void Tower(int n,String Src,String Help,String Dest){
     if(n==1){
        System.out.println("tranfer disk "+n+" from "+Src+" to "+Dest);
        return ;
     }
     Tower(n-1, Src,Dest,Help);
     System.out.println("tranfer disk "+n+" from "+Src+" to "+Dest);
     Tower(n-1,Help,Src ,Dest);
    }
    public static void main(String[]args){
       Tower(3,"S","H","D" );
    }
    
}
