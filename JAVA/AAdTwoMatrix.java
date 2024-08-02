import java.util.Scanner;
public class AAdTwoMatrix {
    public static void printMatrix(int a[][],int b[][]){
        int c[][]=new int [3][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                 c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("the sum of matrix is");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
       
    }
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int n=3,m=3;
        System.out.println("enter matrix 1st");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("enter matrix 2nd");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[i][j]=sc.nextInt();
            }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           System.out.print(b[i][j]+" ");
        }
        System.out.println();
    }
    
    printMatrix(a,b);
    
}
}
