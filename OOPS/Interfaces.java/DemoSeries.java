interface Series {
    int getNext();
    void reset();
    void setStart(int x);
}
class Bytwos implements Series{
    int start;
    int val;
    Bytwos(){
        start=0;
        val=0;
    }
    public int getNext(){
        val+=2;
        return val;
    }
    public void reset(){
        val=start;
    }
    public void setStart(int x){
    start=x;
    val=x;
    }
}
class DemoSeries{
    public static void main(String[]args){
    Bytwos ob=new Bytwos();
    for(int i=0;i<5;i++){
        System.out.println("next value is "+ ob.getNext());
    }
    System.out.println("\nReseting ");
    ob.reset();
    for(int i=0;i<5;i++){
        System.out.println("next value is "+ob.getNext());
    }
    System.out.println("\nStarting at 100");
    ob.setStart(100);
    for(int i=0;i<5;i++){
        System.out.println("next value is 
        "+ob.getNext());
    }
    }
}
