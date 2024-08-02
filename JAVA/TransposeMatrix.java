public class TransposeMatrix {
    public static void transpose(int a[][],int b[][]){
     for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            b[i][j]=a[j][i];
        }
     }
    }
    
    public static void main(String[] args) {
        int a[][]={{1,2,3,},
                   {4,5,6},
                   {7,8,9}};
        int b[][]=new int [a.length][a.length];
        transpose(a,b);
     System.out.println("resutant matrix is:");
     for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            System.out.print(b[i][j]+" ");
        }
        System.out.println();
     }
    }
    
}
