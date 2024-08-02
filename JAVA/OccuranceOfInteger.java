public class OccuranceOfInteger {
    public static int occur(int arr[],int k){
          int count=0;
          for(int i=0;i<arr.length;i++){
            if(k==arr[i]){
                count++;
            }
          }
          return count;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,3,6,5,4,5,4,4};
        int k=4;
        System.out.println("The occurence of given integer is "+occur(arr, k)+"  times");
    }
    
}
