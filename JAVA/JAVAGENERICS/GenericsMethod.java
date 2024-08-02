public class GenericsMethod {
    public static void main(String[] args) {
        GenericsMethod obj=new GenericsMethod();
       obj.printData("hello");
        obj.printData(123);
        
    } 
     <E> void printData(E data){
        System.out.println(data);
    }   
    //==>OR
    // static <E> void printData(E data){
    //     System.out.println(data);
    // }   
}
