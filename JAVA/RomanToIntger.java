public class RomanToIntger {
    public static int Roman(String s){
        int count=0;
        int i=0;
        while(i<s.length()){
         if(s.charAt(i)=='M'){
            count+=1000;
         }
         else if(s.charAt(i)=='D'){
           count+=500;
         }
          else if(s.charAt(i)=='C' && (i+1)<s.length() && s.charAt(i+1)=='M'){
            count-=100;
         }
          else if(s.charAt(i)=='C' && (i+1)<s.length() && s.charAt(i+1)=='D'){
            count-=100;
         }
          else if(s.charAt(i)=='C'){
           count+=100;
         }
          else if(s.charAt(i)=='L'){
           count+=50;
         }
          else if(s.charAt(i)=='X' && (i+1)<s.length() && s.charAt(i+1)=='C'){
            count-=10;
         }
          else if(s.charAt(i)=='X' && (i+1)<s.length() && s.charAt(i+1)=='L'){
            count-=10;
         }
          else if(s.charAt(i)=='X'){
           count+=10;
         }
          else if(s.charAt(i)=='V'){
           count+=5;
         }
          else if(s.charAt(i)=='I' && (i+1)<s.length() && s.charAt(i+1)=='X'){
            count-=1;
         }
         else if(s.charAt(i)=='I' && (i+1)<s.length() && s.charAt(i+1)=='V'){
            count-=1;
         }
          else if(s.charAt(i)=='I'){
           count+=1;
         }
         i++;
        }
        return count;
    }
    public static void main(String[]args){
      System.out.println(Roman("MC"));
    }
}
