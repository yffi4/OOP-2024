package Task2;

public class King extends Piece{
    public King(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(a.getX() - b.getX());
        int dy = Math.abs(a.getY() - b.getY());
        return isMoveLimits(b) && (dx <= 1 && dy <= 1);
    }
    public String toString(){
        return "King at " + a.toString();
    }
}
