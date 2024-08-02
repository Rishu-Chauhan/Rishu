public class rishu {
    public static void large(int num[]){
        int max=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(max>num[i]){
            max=num[i];
            }
        }
        System.out.println("The minimum number in this array ="+max);
    }
    public static void main(String[] args) {
        int num[]={2,4,7,5,9};
        large(num);
    }
    
}
