public class TwoSum {
    public static int[]  printTarget(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                int arr1[]={i,j};
                    return arr1;
                }
            }
        }
        return null;

    } 
    public static void main(String[]args){
        int arr[]={2,7,4,8,3};
        int target=9;
        System.out.println(printTarget(arr, target));
    } 
    
}
