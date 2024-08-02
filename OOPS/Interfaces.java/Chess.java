
interface ChessPlayer{
    void move();
}
class Queen implements ChessPlayer{
    public void move(){
        System.out.println("up,down,left,right,diagonal(all 4 dirns)");
    }
}
class King implements ChessPlayer{
    public void move(){
        System.out.println("up,down,left,right,diagonal(only 1 step)");
    }
}
class Rook implements ChessPlayer{
    public void move(){
        System.out.println("left,right,up ,down");
    }
}

public class Chess {
    public static void main(String[]args){
      Queen q=new Queen();
      q.move();
    }
    
}
