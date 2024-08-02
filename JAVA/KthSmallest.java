public class KthSmallest {
    public static int getKth(int arr[],int k){
     return arr[k-1];
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,9};
        int k=4;
        System.out.println(getKth(arr, k));
    }
    
}
