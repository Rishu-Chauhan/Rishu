public class removeDublicate {
    public static void remDublicate(String str,int idx,StringBuilder newStr,boolean Map[]){
     if(idx==str.length()){
        System.out.println(newStr);
        return;
     }
     char currChar=str.charAt(idx);
     if(Map[currChar-'a']==true){
        //dublicate
        remDublicate(str, idx+1, newStr, Map);
     }
     else{
        Map[currChar-'a']=true;
        remDublicate(str, idx+1, newStr.append(currChar), Map);
     }
    }
    public static void main(String[]args){
     String str="rrraammm";
     StringBuilder newStr = new StringBuilder();
     boolean[] map = new boolean[26]; // Assuming only lowercase letters
     remDublicate(str, 0, newStr, map);
     
    }
}
