public class SuffulArray {
    public static int[] print(int nums[],int n){
        int temp[]=new int[nums.length];
          for(int i=0;i<n;i++){
          temp[i*2]=nums[i];
          temp[(i*2)+1]=nums[i+n];
        }
        return temp;
    }
    
   public static void main(String[]args){
    int nums[]={2,5,1,3,4,7};
    print(nums,3);
    int n=nums.length;
    
 
    
   } 
}
