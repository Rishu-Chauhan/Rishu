public class Alternate121 {
    public  static void  Alternate(int arr[],int count[]){
     
        int k=0;
        for(int i=0;i<arr.length;i++){
            count[k++]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            count[k++]=arr[i];
        }
      

    }
    public static void main(String[]args){
        int arr[]={1,2,1};
        int count[]=new int[arr.length*2];
        Alternate(arr,count);
        for(int i=0;i<count.length;i++){
            System.out.print(count[i]+" ");
        }
    }
}
