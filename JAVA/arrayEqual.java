import java.util.Arrays;
public class arrayEqual {
    public static void main(String []args){
        int a[]={1,4,6,7};
        int b[]={1,4,6,7,9};
        boolean result=Arrays.equals(a,b);
        if(result==true){
            System.out.println("Two arrays are equal ");
        }
        else{
            System.out.println("not equal");
        }
    }
    
}


