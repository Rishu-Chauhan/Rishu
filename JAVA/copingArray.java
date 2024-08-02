public class copingArray {
  public static void main(String args[]){
    int a[]={1,4,7};
    int b[]=new int [a.length];
    b=a;
    b[0]++;
    System.out.println("content of a[]");
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    System.out.println();
    System.out.println("content of b[]");
    for(int i=0;i<b.length;i++){
        System.out.print(b[i]+" ");
    }
  }  
}
