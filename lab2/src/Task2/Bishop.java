package Task2;

public class Bishop extends Piece{
    public Bishop(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(a.getX() - b.getX());
        int dy = Math.abs(a.getY() - b.getY());
        return isMoveLimits(b) && dx == dy;

    }
    public String toString(){
        return "Bishop at" + a.toString();
    }
}
