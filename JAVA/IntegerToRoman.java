public class IntegerToRoman {
    public static String RomanNumber(int n){
     String Roman=""; 
     int RomanNum[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
     String RomanLetter[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
     for(int i=0;i<RomanNum.length;i++){
        while(n>= RomanNum[i]){
            Roman+= RomanLetter[i];
            n-=RomanNum[i]; 
        }
     } 
     return Roman;  
    }
   public static void main(String[] args) {
    System.out.println(RomanNumber(69));
   } 
}
