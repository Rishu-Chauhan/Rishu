public class traceOfMatrix {
    public static void trace(int a[][]){
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i==j){
               temp+=a[i][j];
                }
            }
         }
         System.out.println("The trace of a matrix="+temp);
    }
    public static void Normal(int a[][]){
        int s=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                s+=a[i][j]*a[i][j];
            }
         }
         int n= (int)Math.sqrt(s);
       System.out.println("The normal of matrix ="+n);
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3,},
                   {4,5,6},
                   {7,8,9}};
                   trace(a);
                   Normal(a);
            
    }
    
}
