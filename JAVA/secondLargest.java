public class secondLargest {
    public static int largestNumber(int arr[]){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
               
             }
             else if(arr[i]>secondLargest){
                    secondLargest=arr[i];
             }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[]={7,6,4,9,3,2};
       System.out.println( "The second largest number ="+largestNumber(arr));

    }
}
