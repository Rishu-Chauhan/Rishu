public class practice {
    public static void printArr(int arr[]){
        int j=1,i=0;
        for( i=0;i<arr.length;i++){
            if(i % 2==0){
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              i=i+2;
              j=j+2;
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={4,6,1,8,4,9};
        printArr(arr);
        printArray(arr);
    }
    
}
