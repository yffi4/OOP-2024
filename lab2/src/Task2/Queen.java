package Task2;

public class Queen extends Piece{
    public Queen(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
       return  (new Rook(a)).isLegalMove(b) || (new Bishop((a)).isLegalMove(b));
    }
    public String toString(){
        return "Queen at " + a.toString();
    }
}
