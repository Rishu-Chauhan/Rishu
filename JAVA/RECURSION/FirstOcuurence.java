public class FirstOcuurence {
    public static int FirOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirOcc(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,5,4,3,5,77};
       System.out.println( FirOcc(arr,77,0));
    }
    
}
