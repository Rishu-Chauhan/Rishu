public class rotationOfMatrix {
    public static void rotate(int a[],int d){
     int temp[]=new int [a.length];
     int k=0;
     for(int i=d;i<a.length;i++){
          temp[k]=a[i];
          k++;
             }
             for(int i=0;i<d;i++){
                temp[k]=a[i];
                k++;
             }
             for(int i=0;i<a.length;i++){
                a[i]=temp[k];
             }
    } 
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int d=2;
        rotate(a, d);
        printArray(a);
    }
    
}
