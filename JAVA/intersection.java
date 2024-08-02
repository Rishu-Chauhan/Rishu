public class intersection {
    public static void print(int arr[],int arr1[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public static void main(String[]args){
        int arr[]={1,2,1,2,3};
        int arr1[]={1,2,1,2,3,6};
        print(arr, arr1);
        
        

    }
    
}
