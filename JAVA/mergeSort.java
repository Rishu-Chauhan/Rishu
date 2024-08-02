public class mergeSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Merge(int arr[],int si,int ei){
       if(si>=ei){//base case
        return;
       }
        //Kaam
        int mid=si+(ei-si)/2;
        Merge(arr, si, mid);//leftPart
        Merge(arr, mid+1, ei);//right part
      divide(arr, si,mid, ei);
    }
    public static void divide(int arr[],int si,int mid,int ei){
    int temp[]=new int [ei-si+1];
    int i=si;//iterator for leftPart
    int j=mid+1;//iterator for rightPart
    int k=0;//iterator for temp arr
    while(i<=mid && j<=ei){
        if(arr[i]<arr[j]){
           temp[k]=arr[i] ;
           i++;
        }
        else{
            temp[k]=arr[j];
            j++; 
        }
        k++;
    }
    //leftpart
    while(i<=mid){
    temp[k]=arr[i];
    i++;
    k++;
    }
    //rightpart
    while(j<=ei){
        temp[k]=arr[j];
        k++;
        j++;
    }
    //copy temp to original
    for( k=0,i=si;k<temp.length;k++,i++){
        arr[i]=temp[k];
    }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        Merge(arr, 0, arr.length-1);
        printArr(arr);
        
    }
}
