public class sort012 {
    public static void sort(int arr[]){
        int lo=0;
        int hi=arr.length-1;
        int mid=0;
        int temp=0;
        while(mid<=hi){
            switch(arr[mid]){
                case 0:temp=arr[lo];
                       arr[lo]=arr[mid];
                       arr[mid]=temp;
                       lo++;
                       mid++;
                       break;
                case 1: temp=arr[mid];
                        arr[mid]=arr[hi];
                        arr[hi]=temp;
                        hi--;
                        break;       
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int  arr[]={0,1,1,0,1,2,1,1,2,0,0,0,1};
        sort(arr);
        printArray(arr);
    }
    
}
