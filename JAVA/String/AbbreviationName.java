public class AbbreviationName {
    public static void PrintStr(String str){
        if(str.length()==0){
            return;
        }
       System.out.print(str.charAt(0));
        for(int  i=1;i<str.length()-1;i++){
           if(str.charAt(i)==' '){
                System.out.print("."+str.charAt(i+1));
            }

        }
    }
    public static void main(String[]args){
        String str="Satish Kumar Dhawan";
        PrintStr(str);
    }
    
}
