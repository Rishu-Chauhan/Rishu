public class reverseString {
    public static void printString(String str ){
StringBuilder sb=new StringBuilder("");
        for( int i=str.length();i>0;i--){
           sb.append(str.charAt(i)); 
        }
        
    }
    public static void main(String []args){
String str="Rishu";
printString(str);
    }
}
